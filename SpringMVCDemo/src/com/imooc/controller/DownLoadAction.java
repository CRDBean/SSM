package com.imooc.controller;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DownLoadAction {
	
	
	@RequestMapping("/fileDownLoad.action")
	public ResponseEntity<byte[]> fileDownload() throws Exception {
		//�ļ���·������Ȼ������Լ�ƴ��
		String path = "E:/WorkSpace1/SpringMVCDemo/WebContent/WEB-INF/fileupload/1.png";
		File file = new File(path);
		HttpHeaders headers = new HttpHeaders();
		// Ϊ�˽������������������
		String fileName = new String(file.getName().getBytes("UTF-8"), "iso-8859-1");
		headers.setContentDispositionFormData("attachment", fileName);
		headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
		return new ResponseEntity<byte[]>(FileUtils.readFileToByteArray(file), headers, HttpStatus.CREATED);
	}
	

}
