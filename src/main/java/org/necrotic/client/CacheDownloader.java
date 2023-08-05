package org.necrotic.client;

import com.google.common.base.Objects;
import net.runelite.client.ui.ClientUI;
import org.necrotic.Configuration;
import org.necrotic.client.tools.Hashing;

import java.awt.*;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
//you may start

/**
 * Handles cache downloading
 * blah balh **BAD ASS cODE ***
 */
public class CacheDownloader {

	private static final String CACHE_FILE_NAME = "cache.zip";
	private static final String CACHE_URL = "https://tarnserver.com/enforced/beta/cache/t-v1.zip";
	public static final String URL_TO_LOADING_IMAGES = "https://tarnserver.com/enforced/beta/img/";
	public static final String MIRROR_URL_TO_LOADING_IMAGES = "https://tarnserver.com/enforced/beta/img/";
	public static boolean UPDATING = true;

	public static boolean updatedCache() {
		if(Configuration.updated) {
			Client.trayIcon.displayMessage("Tarn Client", "Cache up to date!", TrayIcon.MessageType.INFO);
			UPDATING = false;
			return true;
		}

		try {
			Client.trayIcon.displayMessage("Tarn Client", "Checking For Cache Update.. Please Wait", TrayIcon.MessageType.INFO);
			String current = getCurrentVersion();
			String newest = getNewestVersion();
			if (!Objects.equal(newest, current) || forceUpdateCache()) {
				Client.trayIcon.displayMessage("Tarn Client", "Cache update needed. Please wait...", TrayIcon.MessageType.INFO);
				if (Configuration.STOP_CACHE_UPDATES) {
					System.out.println("Stopped a cache update from occurring due to current configuration.");
				} else {
					System.out.println(forceUpdateCache() ? "We are localhost, and being forced to update cache." : "Updated Tarn Cache. No manual overrides detected, proceeding as normal. Current: " + current + ", Newest: " + newest);
					downloadCache();
					unzipCache();
				}
			}
			UPDATING = false;
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		UPDATING = false;
		return false;
	}

	public static boolean forceUpdateCache() {
		return Configuration.SERVER_HOST().equalsIgnoreCase("localhost") && Configuration.FORCE_CACHE_UPDATE;
	}

	public static void downloadCache() throws IOException {
		URL url = new URL(CACHE_URL);
		HttpURLConnection httpConn = (HttpURLConnection) url.openConnection();
		httpConn.addRequestProperty("User-Agent", "Mozilla/4.76");
		int responseCode = httpConn.getResponseCode();
		Client.trayIcon.displayMessage("Tarn Client", "Downloading Cache Update...", TrayIcon.MessageType.INFO);
		if (responseCode == HttpURLConnection.HTTP_OK) {
			try (BufferedInputStream inputStream = new BufferedInputStream(httpConn.getInputStream());
				 FileOutputStream outputStream = new FileOutputStream(Signlink.getCacheDirectory() + File.separator + CACHE_FILE_NAME)) {
				byte[] buffer = new byte[4096];
				long numWritten = 0;
				int bytesRead;
				long length = httpConn.getContentLength();
				while ((bytesRead = inputStream.read(buffer)) != -1) {
					outputStream.write(buffer, 0, bytesRead);
					numWritten += bytesRead;
					Client.trayIcon.displayMessage("Tarn Client", "Cache : "+(int) (((double) numWritten / (double) length) * 100D)+"/100%", TrayIcon.MessageType.INFO);
					Client.getClient().setLoadingPercentage((int) (((double) numWritten / (double) length) * 100D));
				}
			} catch (IOException e) {
				System.out.println("Cache host replied HTTP code: " + responseCode);
				throw e;
			}
		}
		httpConn.disconnect();
	}

	private static void unzipCache() {
		Client.trayIcon.displayMessage("Tarn Client", "Unzipping Cache...", TrayIcon.MessageType.INFO);
		try (FileInputStream fis = new FileInputStream(Signlink.getCacheDirectory() + CACHE_FILE_NAME);
			 BufferedInputStream in = new BufferedInputStream(fis);
			 ZipInputStream zin = new ZipInputStream(in)) {
			ZipEntry e;
			while ((e = zin.getNextEntry()) != null) {
				String filePath = Signlink.getCacheDirectory() + e.getName();
				if (e.isDirectory()) {
					new File(filePath).mkdir();
				} else {
					unzipPartlyArchive(zin, filePath);
				}
			}
			new File(Signlink.getCacheDirectory() + CACHE_FILE_NAME).delete();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void unzipPartlyArchive(ZipInputStream zin, String filePath) throws Exception {
		try (FileOutputStream out = new FileOutputStream(filePath)) {
			byte[] b = new byte[1024];
			int len;
			while ((len = zin.read(b)) != -1) {
				out.write(b, 0, len);
			}
		}
	}

	public static String getCurrentVersion() {
		return Hashing.getLocalChecksum(Signlink.getCacheDirectory() + CACHE_FILE_NAME);
	}

	public static String getNewestVersion() {
		return Hashing.getRemoteChecksum(CACHE_URL);
	}
}