package com.imooc.controller;
import java.io.File;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
@Controller
public class UploadAction {
	// 文件上传功能
	@RequestMapping("/fileUpload.action")
	public String fileUpload(MultipartFile file) throws Exception {
		if (!file.isEmpty()) {
			//打印文件的名称
			System.out.println("FileName:" + file.getOriginalFilename());
			//确定上传文件的位置
			String path = "E:/WorkSpace1/SpringMVCDemo/WebContent/WEB-INF/fileupload";
			File newFile = new File(path, file.getOriginalFilename());
			if (!newFile.exists()) {
				newFile.mkdirs();
			}
			// 上传
			file.transferTo(newFile);
		}
		//上传成功后转发到success.jsp
		return "success";
	}

}
