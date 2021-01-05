package FileCopy;

import java.io.*;

public class One {
	
	public static void main(String[] args) {
		String srcPathStr = "E:\\code\\java hw\\src\\FileCopy\\1.txt";
		String desPathStr = "E:\\code\\java hw\\src\\FileCopy\\2.txt";
		copy(srcPathStr, desPathStr);
	}

	public static void copy(String srcPathStr, String desPathStr) {
		String newFileName = srcPathStr.substring(srcPathStr.lastIndexOf("\\") + 1);
		System.out.println("source file:" + newFileName);
		desPathStr = desPathStr + File.separator + newFileName;
		System.out.println("目标文件地址：" + desPathStr);
		try {

			FileInputStream fileInputStream = new FileInputStream(srcPathStr);

			FileOutputStream fileOutputStream = new FileOutputStream(desPathStr);

			byte[] data = new byte[1024];
			int len = 0;

			while ((len = fileInputStream.read(data)) != -1) {
				fileOutputStream.write(data, 0, len);
			}
			fileInputStream.close();
			fileOutputStream.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
