package org.necrotic.client;

import org.necrotic.Configuration;

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

	private static final String CACHE_FILE_NAME = "t-v1.zip";
	private static final String CACHE_URL = "https://tarnserver.com/enforced/beta/cache/t-v1.zip";
	private static final String NEWEST_VERSION_FILE_URL = "https://tarnserver.com/enforced/beta/cache/cache_version.txt";
	private static final String CURRENT_VERSION_FILE = "cache_version.txt";
	public static final String URL_TO_LOADING_IMAGES = "https://tarnserver.com/enforced/beta/img/";
	public static final String MIRROR_URL_TO_LOADING_IMAGES = "https://tarnserver.com/enforced/beta/img/";
	public static boolean UPDATING = true;

	public static boolean updatedCache() {
		try {
			double newest = getNewestVersion();
			double current = getCurrentVersion();
			if (cacheDownloadRequired(newest, current) || forceUpdateCache()) {
				if (Configuration.STOP_CACHE_UPDATES) {
					System.out.println("Stopped a cache update from occurring due to current configuration.");
				} else {
					System.out.println(forceUpdateCache() ? "We are localhost, and being forced to update cache." : "Updated Tarn Cache. No manual overrides detected, proceeding as normal. Current: " + current + ", Newest: " + newest);
					downloadCache();
					unzipCache();
					setLatestCacheVersion(newest);
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

	public static boolean cacheDownloadRequired(double newest, double current) {
		return newest != current;
	}

	public static void downloadCache() throws IOException {
		URL url = new URL(CACHE_URL);
		HttpURLConnection httpConn = (HttpURLConnection) url.openConnection();
		httpConn.addRequestProperty("User-Agent", "Mozilla/4.76");
		int responseCode = httpConn.getResponseCode();

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

	public static double getCurrentVersion() {
		try (BufferedReader br = new BufferedReader(new FileReader(Signlink.getCacheDirectory() + CURRENT_VERSION_FILE))) {
			return Double.parseDouble(br.readLine());
		} catch (Exception e) {
			return 0.1D;
		}
	}

	public static double getNewestVersion() {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(new URL(NEWEST_VERSION_FILE_URL).openStream()))) {
			return Double.parseDouble(br.readLine());
		} catch (Exception e) {
			return 0.1D;
		}
	}

	public static void setLatestCacheVersion(double newest) throws IOException {
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(Signlink.getCacheDirectory() + CURRENT_VERSION_FILE))) {
			bw.write(String.valueOf(newest));
		}
	}
}