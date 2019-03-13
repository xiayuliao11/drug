package com.jk.utils;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.FileUtils;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;

/**
 * <pre>
 * 项目名称：springmvc_upload    
 * 类名称：FileUtil    
 * 类描述：    
 * 创建人：wzstart    
 * 创建时间：2018-10-13 上午9:41:30    
 * 修改人：wzstart  
 * 修改时间：2018-10-13 上午9:41:30    
 * 修改备注：       
 * @version
 * </pre>
 */
public class FileUtil {

	/**
	 * <pre>
	 * upload(这里用一句话描述这个方法的作用)   
	 * 创建人：wzstart     
	 * 创建时间：2018-10-13 上午9:43:06    
	 * 修改人：wzstart      
	 * 修改时间：2018-10-13 上午9:43:06    
	 * 修改备注：
	 * </pre>
	 */
	public static String upload(MultipartFile file, HttpServletRequest request) {

		if (file != null && file.getSize() > 0) {
			// 上传文件的名字
			String name = file.getOriginalFilename();
			// 获取后缀名
			String suffix = name.substring(name.lastIndexOf("."));
			// 生成唯一标示
			SimpleDateFormat format = new SimpleDateFormat("yyyyMMddHHmmss");
			Date date = new Date();
			// 文件名 唯一
			String prefix = format.format(date);

			String realPath = request.getServletContext().getRealPath("upload");

			File fileTemp = new File(realPath, prefix + suffix);
			// model.addAttribute("name", prefix + suffix);
			if (!fileTemp.exists()) {
				fileTemp.mkdirs();
			}

			try {
				file.transferTo(fileTemp);
			} catch (IllegalStateException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return prefix + suffix;
		} else {
			return "not found";
		}

	}

	/**
	 * <pre>
	 * download(这里用一句话描述这个方法的作用)   
	 * 创建人：wzstart     
	 * 创建时间：2018-10-13 上午9:56:48    
	 * 修改人：wzstart      
	 * 修改时间：2018-10-13 上午9:56:48    
	 * 修改备注：
	 * </pre>
	 */
	public static ResponseEntity<byte[]> download(HttpServletRequest request, String filename) {
		// 获取文件的在服务器地址
		String realPath = request.getServletContext().getRealPath("upload");
		// 要下载的文件对象
		File downloadFile = new File(realPath, filename);

		// 设置http的响应头
		HttpHeaders headers = new HttpHeaders();
		headers.setContentDispositionFormData("attachment", filename);
		headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);

		// 设置下载的内容
		ResponseEntity<byte[]> entity = null;
		try {
			entity = new ResponseEntity<byte[]>(
					FileUtils.readFileToByteArray(downloadFile), headers,
					HttpStatus.CREATED);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return entity;
	}
	
		
	public static String fileUploadBootStrap(MultipartFile file, HttpServletRequest request){
			
			//保存文件的目标目录
			String savePath = request.getRealPath("/");
	//		String savePath = request.getSession().getServletContext().getRealPath(url);
			
			//获取源文件后缀名称
			//12345.jpg
			int suffixIndex = file.getOriginalFilename().lastIndexOf(".");
			//  .jpg
			String suffixName = file.getOriginalFilename().substring(suffixIndex);
			
			//生成新的文件名称，原因：防止文件名称一样后者上传的文件会覆盖前者上传的文件（前提是文件名称必须一样并且在用一个目录下）
			//生成新的文件名称，保证文件名称唯一有两种方法：
			// 	  1.通过UUID实现文件名称唯一 （UUID会生成32位字母+数字唯一的一个字符串）
			//	  2.通过时间戳现文件名称唯一  （时间戳是毫秒级时间 时间会一直往上加，生成13位数字）注意只有java生成13位 其他则是10位比如oracle、mysql、php
			//  获取时间戳
			//long currentTimeMillis = System.currentTimeMillis();
			//System.out.println(currentTimeMillis);
			
			String newFileName = UUID.randomUUID().toString().replace("-", "") + suffixName;
			
			//检测目标目录是否存在
			File targetFile = new File(savePath, newFileName);
			if(!targetFile.exists()){
				//创建目标目录
				targetFile.mkdirs();
			}
			
			try {
				// 使用transferTo（dest）方法将上传文件写到服务器上指定的文件。
				file.transferTo(targetFile);
			} catch (IllegalStateException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return newFileName;
		}

}
