package com.dragon.demo.common;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Component
public class Common {

	public String UnifiedTime(Date date) {
		// 使用静态方法获取实例。只能格式化日期
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return df.format(date);
	}

	public String SERVERPATH = "http://150.158.96.29:8082/my-shop-img";

	private String PATH = "/www/server/tomcat8/webapps/my-shop-img";

	public void uploadImg(MultipartFile filePart, String fileName, String path) throws Exception {
		path = PATH + path;
		File f = new File(path);
		if (f.exists()) {// 判断文件夹是否存在
		} else {
			// 先创建文件所在的目录
			f.mkdirs();
		}
		OutputStream out = null;
		InputStream fileContent = null;
		String pathname = path + File.separator + fileName; // 得到上传文件路径+文件名
		out = new FileOutputStream(new File(pathname)); // 创建输出流
		fileContent = filePart.getInputStream(); // 得到输入流，即文件内容
		final byte[] bytes = new byte[1024]; // 创建数组，准备每次读1024字节，即1k
		// 为了提高输出效率，每次从文件内容中读1024字节，然后输出。也可用BufferedOutputStream。
		// 直至read返回-1，表示读完了。
		int read = fileContent.read(bytes); // 读到的字节数
		while (read != -1) {
			out.write(bytes, 0, read); // 写，即输出
			read = fileContent.read(bytes); // 接着读
		}
		out.close();// 关闭输入输出流
		fileContent.close();

	}

	/*
	 * 返回的新唯一文件名 = UUID + 原文件的后缀名。
	 */
	public String generateUniqueFileName(String originalName) {
		if (originalName == null) {
			return null;
		}
		// 生成唯一的文件名如下，以“宋智孝.jpg”为例
		int suffixIndex = originalName.lastIndexOf("."); // 取得后缀的位置，如3
		String suffix = originalName.substring(suffixIndex); // 取得后缀，如.jpg
		String uuid = UUID.randomUUID().toString(); // 生成UUID，并转化为String
		uuid = uuid.replaceAll("-", ""); // 去掉UUID的-符号
		String uniqueName = uuid + suffix;
		return uniqueName;
	}

}
