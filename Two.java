package FileCopy;

import java.io.*;

public class Two {

	public static void main(String[] args) throws IOException {

		File srcPathStr = new File("E:\\code\\java hw\\src\\FileCopy\\3.txt");
		File desPathStr = new File("E:\\code\\java hw\\src\\FileCopy\\4.txt");
		
		copy(srcPathStr, desPathStr);
	}

	public static void copy(File src, File des) throws IOException {
		InputStream inputStream = null;
		OutputStream outputStream = null;
		try {
			inputStream = new FileInputStream(src);
			outputStream = new FileOutputStream(des);
			byte[] buff = new byte[1024];
			int read;
			while ((read = inputStream.read(buff)) != -1) {
				outputStream.write(buff, 0, read);
			}
		} finally {
			inputStream.close();
			outputStream.close();
		}
	}
}
