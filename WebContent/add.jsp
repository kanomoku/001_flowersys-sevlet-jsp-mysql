<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery-1.7.2.js"></script>
<script type="text/javascript">
	//页面加载完成后执行
	//相当于 window.onload=function(){}  $(document).ready(function(){});
	//监听表单提交事件有两种提交方式： 1.监听表单 2.监听表单提交按钮
	$(function() {
		$("form").submit(
				function() {
					//表单选择器  ：input标签type属性值
					if ($(":text:eq(0)").val() == ""
							|| $(":text:eq(1)").val() == ""
							|| $(":text:eq(2)").val() == "") {
						alert("请填写完整信息");
						//阻止默认行为
						return false;
					}
				});
	});
</script>
</head>
<body>
	<!-- post: 字节流  最大2GB 更安全  相对效率低
         get:  字符流  最大2KB
	-->
	<form action="insert" method="post">
		<table border='1'>
			<tr>
				<td colspan="2" style="text-align: center; font-size: 20px; font-weight: bold">花卉信息</td>
			</tr>
			<tr>
				<td><b>花卉名称</b></td>
				<td><input type="text" name="name" /></td>
			</tr>
			<tr>
				<td><b>花卉价格</b></td>
				<td><input type="text" name="price" /></td>
			</tr>
			<tr>
				<td><b>原产地</b></td>
				<td><input type="text" name="production" /></td>
			</tr>
			<!-- align="center" html的居中  加在tr/td里表示表格中内容居中，放在table中表示表格相对于父标签居中 -->
			<tr>
				<td colspan="2" align="center">
					<input type="submit" name="提交">
					<input type="reset" name="重置">
				</td>
			</tr>
		</table>
	</form>
</body>
</html>