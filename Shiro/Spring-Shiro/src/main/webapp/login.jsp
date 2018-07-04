<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="jquery/jquery-3.2.1.min.js"></script>
<script type="text/javascript">
$(function(){
	
	
	 var msg = '<%=request.getAttribute("msg")%>';//获得LoginMethod中返回的的信息
		if(msg!=null&&msg!="null"&&msg!=""){
			alert(msg);
		}

	});
</script>
<title>Insert title here</title>
</head>
<body>



	<h4>Login Page</h4>
	${msg}
	<br>
	<br>
	<form action="login.action" method="POST">
		username: <input type="text" name="username" /> <br> <br>
		password: <input type="password" name="password" /> <br> <br>
		<input type="submit" value="Submit" />
	</form>

</body>
</html>