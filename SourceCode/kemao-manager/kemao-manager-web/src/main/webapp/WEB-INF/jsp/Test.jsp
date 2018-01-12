<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta charset="utf-8">
<meta name="renderer" content="webkit|ie-comp|ie-stand">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no">
<title>测试页面</title>
<meta name="keywords" content="">
<meta name="description" content="">
<link rel="Shortcut Icon" href="http://kcat-1251241286.cosgz.myqcloud.com/images/index/tubiao.ico">
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jQuery/jquery.min.1.7.1.js"></script>
<script type="text/javascript">
	$(function(){
		alert("${pageContext.request.contextPath}");
	});
</script> 

</head>

<body>
测试页面${pageContext.request.contextPath}
<br/>
图片：<img style="float: right;" src="${pageContext.request.contextPath}/images/erweima.jpg">
</body>
</html>