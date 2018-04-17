<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
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
	
		<h1 class="typeName">计算机应用</h1>
		<div class="col-md-10">
			<div class="row"> 
				<div class="col-md-3">
					<div class="col-md-4">
						<img src="http://kcat-1251241286.cosgz.myqcloud.com/images/Sjy17.png" class="ruanjian">
					</div>
					<div class="col-md-8">
						<p class="title">Android ADT</p>
						</br>
						<a class="down_btn">下载</a>
					</div>
				</div>
				<div class="col-md-3">
					<div class="col-md-4">
						<img src="http://kcat-1251241286.cosgz.myqcloud.com/images/Sjy17.png" class="ruanjian">
					</div>
					<div class="col-md-8">
						<p class="title">Android ADT</p>
						</br>
						<a class="down_btn">下载</a>
					</div>
				</div>
				<div class="col-md-3">
					<div class="col-md-4">
						<img src="http://kcat-1251241286.cosgz.myqcloud.com/images/Sjy17.png" class="ruanjian">
					</div>
					<div class="col-md-8">
						<p class="title">Android ADT</p>
						</br>
						<a class="down_btn">下载</a>
					</div>
				</div>
				<div class="col-md-3">
					<div class="col-md-4">
						<img src="http://kcat-1251241286.cosgz.myqcloud.com/images/Sjy17.png" class="ruanjian">
					</div>
					<div class="col-md-8">
						<p class="title">Android ADT</p>
						</br>
						<a class="down_btn">下载</a>
					</div>
				</div>
				<div class="col-md-3">
					<div class="col-md-4">
						<img src="http://kcat-1251241286.cosgz.myqcloud.com/images/Sjy17.png" class="ruanjian">
					</div>
					<div class="col-md-8">
						<p class="title">Android ADT</p>
						</br>
						<a class="down_btn">下载</a>
					</div>
				</div>
				<div class="col-md-3">
					<div class="col-md-4">
						<img src="http://kcat-1251241286.cosgz.myqcloud.com/images/Sjy17.png" class="ruanjian">
					</div>
					<div class="col-md-8">
						<p class="title">Android ADT</p>
						</br>
						<a class="down_btn">下载</a>
					</div>
				</div>
			</div>
			
			
		</div>
		
		<!-- 右边导航模块 -->
		<div class="col-md-2" style="background:blue;">
			<h1>bootstrap实战课程等你来战！</h1>
			<p>
						本套课程适用于：1.WEB开发人员；2.网站维护人员、管理人员<br />
						培训技能的目标：使用bootstrap框架快速构建响应式网页，颠覆传统WEB前端！
			</p>
		</div>
	
    </div>
<!--main区域  end-->
</div>


<script type="text/javascript">
$(function(){
/* 	var html="";
 	$.post("${pageContext.request.contextPath}/getStudySoftB.do",function(data){
		$.each(data,function(i,e){	
			html+="<div class='zuo'><div class='nav_b'><ul><li class='xueyuan'>"+data[i].titleBName+"</li></ul></div>";
			$.post("${pageContext.request.contextPath}/getStudySoftS.do",{'titleS_to_titleB':data[i].id},function(data_2){  //循环小标题
				$.each(data_2,function(j,f){
					html+="<div style='padding-top:60px;' class='zhuanye' id='ac"+data_2[j].id+"'><p>"+data_2[j].titleSName+"</p><img src='${pageContext.request.contextPath}/images/hr.png' class='hr'>";
					$.post("${pageContext.request.contextPath}/getStudySoft.do",{'soft_to_titleS':data_2[j].id},function(data_3){  //循环软件内容
						$.each(data_3,function(k,g){
							var href = "${pageContext.request.contextPath}/getStudySoft_All.do?num="+data_3[k].id;
							html+="<div class='ruanjian'><a href='"+href+"' target='_blank'><img src='http://kcat-1251241286.cosgz.myqcloud.com/images/"+data_3[k].softImage+"'/></a>";
							html+="<a href='"+href+"' target='_blank'><p class='big'>"+data_3[k].softName+"</p></a>";
							html+="<p class='small'>"+data_3[k].softType+"</p><a href='"+href+"' target='_blank'><img src='${pageContext.request.contextPath}/images/bxiazai.png' class='xiazai'/></a></div>";
						});
					});
					html+="</div>";
				});
			});
			html+="</div>";
		});
		$(".main").append(html); 
	}); */
 	
	
});

/* $(function(){
	$.ajaxSetup({async:false});
	
	html="";
 	
	$.ajaxSetup({async:false});
 	$.post("${pageContext.request.contextPath}/getStudySoftB.do",function(data){
		$.each(data,function(i,e){	
			html+="<div class='zuo'><div class='nav_b'><ul><li class='xueyuan'>"+data[i].titleBName+"</li></ul></div>";
			$.post("${pageContext.request.contextPath}/getStudySoftS.do",{'titleS_to_titleB':data[i].id},function(data_2){  //循环小标题
				$.each(data_2,function(j,f){
					html+="<div style='padding-top:60px;' class='zhuanye' id='ac"+data_2[j].id+"'><p>"+data_2[j].titleSName+"</p><img src='${pageContext.request.contextPath}/images/hr.png' class='hr'>";
					$.post("${pageContext.request.contextPath}/getStudySoft.do",{'soft_to_titleS':data_2[j].id},function(data_3){  //循环软件内容
						$.each(data_3,function(k,g){
							var href = "${pageContext.request.contextPath}/getStudySoft_All.do?num="+data_3[k].id;
							html+="<div class='ruanjian'><a href='"+href+"' target='_blank'><img src='http://kcat-1251241286.cosgz.myqcloud.com/images/"+data_3[k].softImage+"'/></a>";
							html+="<a href='"+href+"' target='_blank'><p class='big'>"+data_3[k].softName+"</p></a>";
							html+="<p class='small'>"+data_3[k].softType+"</p><a href='"+href+"' target='_blank'><img src='${pageContext.request.contextPath}/images/bxiazai.png' class='xiazai'/></a></div>";
						});
					});
					html+="</div>";
				});
			});
			html+="</div>";
		});
		$(".main").append(html); 
	});
 	
 	
});


 $(function(){ 
	$(".toggle dd").hide(); 
	$(".toggle dt").click(function(){ 
		$(".toggle dd").not($(this).next()).hide(); 
		$(".toggle dt").not($(this).next()).removeClass("current"); 
		$(this).next().slideToggle(100); 
		$(this).toggleClass("current"); 
	}); 
});
 
$(function() {
	$(window).scroll(function(){
		var scrolltop=$(this).scrollTop();		
		if(scrolltop>=700){		
			$("#elevator_item").show();
		}else{
			$("#elevator_item").hide();
		}
	});		
	$("#elevator").click(function(){
		$("html,body").animate({scrollTop: 0}, 500);	
	});
	 $(".active_gun").click(function(){
		 $("html,body").animate({scrollTop:$("#ac"+this.id.substring(6)).offset().top}, 800);
	});
});
*/
</script>
</body>
</html>
