package org.necrotic.client.net;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;


public class HttpDownloadUtility {

	private static final int BUFFER_SIZE = 4096;

	public static boolean downloadFile(String fileURL, String saveDir) {
		try {
			URL url = new URL(fileURL);
			HttpURLConnection httpConn = (HttpURLConnection) url.openConnection();
			httpConn.addRequestProperty("User-Agent", "Mozilla/4.76");
			int responseCode = httpConn.getResponseCode();

			if (responseCode != HttpURLConnection.HTTP_OK) {
				httpConn.disconnect();
				return false;
			}

			String fileName = getFileName(httpConn, fileURL);
			String saveFilePath = saveDir + File.separator + fileName;

			try (InputStream inputStream = httpConn.getInputStream();
				 FileOutputStream outputStream = new FileOutputStream(saveFilePath)) {
				byte[] buffer = new byte[BUFFER_SIZE];
				int bytesRead;

				while ((bytesRead = inputStream.read(buffer)) != -1) {
					outputStream.write(buffer, 0, bytesRead);
				}
			}

			httpConn.disconnect();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	private static String getFileName(HttpURLConnection httpConn, String fileURL) {
		String disposition = httpConn.getHeaderField("Content-Disposition");
		if (disposition != null) {
			int index = disposition.indexOf("filename=");
			if (index > 0) {
				return disposition.substring(index + 10, disposition.length() - 1);
			}
		}
		return fileURL.substring(fileURL.lastIndexOf("/") + 1);
	}
}

