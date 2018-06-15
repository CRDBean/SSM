package com.imooc.controller;
import java.io.File;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
@Controller
public class UploadAction {
	// �ļ��ϴ�����
	@RequestMapping("/fileUpload.action")
	public String fileUpload(MultipartFile file) throws Exception {
		if (!file.isEmpty()) {
			//��ӡ�ļ�������
			System.out.println("FileName:" + file.getOriginalFilename());
			//ȷ���ϴ��ļ���λ��
			String path = "E:/WorkSpace1/SpringMVCDemo/WebContent/WEB-INF/fileupload";
			File newFile = new File(path, file.getOriginalFilename());
			if (!newFile.exists()) {
				newFile.mkdirs();
			}
			// �ϴ�
			file.transferTo(newFile);
		}
		//�ϴ��ɹ���ת����success.jsp
		return "success";
	}

}
