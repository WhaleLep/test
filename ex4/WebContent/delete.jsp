<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head> <title>删除学生信息</title></head>
	<body>
	请输入要删除信息的学生学号<hr width="100%" size="3"> 
		<form action="delete" method="post">
			学号：<input type="text" name="id">
			<input type="submit" value="提  交">
            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;                  
            <input type="reset" value="取  消"> 
		</form>
	</body>
</html>