<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  <!-- jstl -->

<!--[if lt IE 8]><script>window.location.href="${pageContext.request.contextPath}/common/error/index.jsp"</script><![endif]-->
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>专业软件</title>
<link rel="Shortcut Icon" href="http://kcat-1251241286.cosgz.myqcloud.com/images/index/tubiao.ico">
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/zyrj.css" type="text/css" />

<!-- 滚动 -->
<script type="text/javascript" src="${pageContext.request.contextPath}/jQuery/jquery.SuperSlide.min.js"></script>
<!-- 引入 Bootstrap -->
<link href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
<!-- jQuery (Bootstrap 的 JavaScript 插件需要引入 jQuery) -->
<script src="https://code.jquery.com/jquery.js"></script>
<!-- 包括所有已编译的插件 -->
<script src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>


<style type="text/css">
.ruanjian{
	float: left;
    margin-right: 12px;
    margin-top: 15px;
    width: 60px;
    height: 60px;
    border-radius: 100px;
}
.title{
	font-weight: 800;
    font-size: 14px;
    margin-top: 15px;
}
.row{
	border-top-style: solid;
    margin-top: 5px;
    border-color: #e4e4e4;
    border-top-width: 1px;
}
.typeName{
	font-size: 12px;
	color:#b4adad;
	font-weight: 800;
	margin-top:10px;
}
#majorList li{
	margin-top:10px;
}
</style>	
</head>

<body>
<div class="all">
<!--导航部分-->
	<%@ include file="../common/pageheader_top.jsp" %>
	<%@ include file="../common/pageheader_centenr.jsp" %>
	<%@ include file="../common/pageheader_bottom.jsp" %>
<!--导航部分end-->

<!-- banner -->

<!--main区域 start-->
    <div class="main">
<%-- 	<!-- 右边固定的导航start-->
		<div class="you">
			<p class="kslj">快速链接</p>           
			<img src="${pageContext.request.contextPath}/images/hr.png" class="hr" style="width:100%">
			<div class="toggle">
				
			</div>
		</div>
		<div id="elevator_item">
        <a id="elevator" onclick="return false;" title="回到顶部"></a>
		</div>
	<!-- 右边固定的导航end--> --%>
		<div class="col-md-10">
			<c:forEach items="${major}" var="item" varStatus="i"> 
			<div class="typeName">${item}</div>   <!-- 大标题 -->
				<div class="row">
					<c:forEach begin="1" end="${softwareLists.get(i.count-1).size()}" var="software"  varStatus="j" step="1"> 
						<div class="col-md-3">
							<div class="col-md-4">
								<img src="http://kcat-1251241286.cosgz.myqcloud.com/images/Sjy17.png" class="ruanjian">
							</div>
							<div class="col-md-8">
								<p class="title">${softwareLists.get(i.count-1).get(j.count-1) }</p>
								</br>
								<a class="down_btn">下载</a>
							</div>
						</div>
					</c:forEach>  
				</div>
			</c:forEach>
		</div>
		 
			
		
		<!-- 右边导航模块 -->
		<div style="font-weight: 800;color:#b4adad;">快速链接</div>
		<div class="col-md-2" style="border-top-style: solid;border-color: #e4e4e4;border-top-width: 1px;margin-top:15px;">
	
    		<ul id="majorList">
    			<c:forEach items="${major}" var="item" varStatus="i"> 
					<li>${item}</li>
    			</c:forEach>
			</ul>
			
		</div>
	
    </div>
<!--main区域  end-->
</div>


<script type="text/javascript">
$(function(){
	
});

</script>
</body>
</html>
