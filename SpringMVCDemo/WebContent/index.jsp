<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<a href="hello">success</a>
--------------------------------------
    <form action="fileUpload.action" method="post"  enctype="multipart/form-data">
		File<input type="file" name="file">  
		<input type="submit">
	</form>

-------------------
<a href="fileDownLoad.action">文件下载</a>-----------

</body>
</html>