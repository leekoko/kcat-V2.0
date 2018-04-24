<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  <!-- jstl -->

<!--[if lt IE 8]><script>window.location.href="${pageContext.request.contextPath}/common/error/index.jsp"</script><![endif]-->

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="zh-CN">   <!--中文语言-->
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
		<meta http-equiv="x-ua-compatible" content="IE=Edge"> <!--IE8标准渲染模式-->
		<meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no">
		<title>K-Cat后台管理</title>
<!-- 引入 Bootstrap -->
		<link href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
<!-- jQuery (Bootstrap 的 JavaScript 插件需要引入 jQuery) -->
		<script src="https://code.jquery.com/jquery.js"></script>
<!-- 包括所有已编译的插件 -->
		<script src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>
		<link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap-maizi.css" /> <!-- 覆盖原生样式-->
		<script src="${pageContext.request.contextPath}/js/Chart.js"></script>
		<script src="${pageContext.request.contextPath}/js/script.js"></script>
		
	</head>
	
	<body>
<!--导航s-->
		<nav class="navbar navbar-default navbar-fixed-top">
		    <div class="container">
		    <div class="navbar-header">
	<!--小屏幕按钮-->
		        <button class="navbar-toggle" data-toggle="collapse"
		                data-target=".navbar-collapse">
		            <span class="sr-only">切换导航</span>
		            <span class="icon-bar"></span>
		            <span class="icon-bar"></span>
		            <span class="icon-bar"></span>
		        </button>
	<!--logo-->
		        <a class="navbar-brand" href="index.html">K-Cat Admin</a>
		    </div>
		    
	<!-- 导航内容-->
		    <div class="collapse navbar-collapse">
		        <ul class="nav navbar-nav">
		            <li class="active"><a href="index.html"><span class="glyphicon glyphicon-home"></span>&nbsp;&nbsp;后台首页</a></li>
		            <li><a href="user_list.html"><span class="glyphicon glyphicon-user"></span>&nbsp;&nbsp;用户管理</a></li>
		            <li><a href="${pageContext.request.contextPath}/content"><span class="glyphicon glyphicon-list-alt"></span>&nbsp;&nbsp;内容管理</a></li>
		            <li><a href="tag.html"><span class="glyphicon glyphicon-tag"></span>&nbsp;&nbsp;标签管理</a></li>
		        </ul>
		        <ul class="nav navbar-nav navbar-right">
		            
					<li class="dropdown">  <!--修改div为li-->
						<a type="button" id="dropdownMenu1" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
					    admin
					    		<span class="caret"></span>
					    </a>  <!-- 修改button为a -->
						<ul class="dropdown-menu" aria-labelledby="dropdownMenu1">
							<li>
								<a href="index.html"><span class="glyphicon glyphicon-screenshot"></span>&nbsp;&nbsp;前台首页</a>
							</li>
							<li>
								<a href="#"><span class="glyphicon glyphicon-user"></span>&nbsp;&nbsp;个人主页</a>
							</li>
							<li>
								<a href="#"><span class="glyphicon glyphicon-asterisk"></span>&nbsp;&nbsp;个人设置</a>
							</li>
							<li>
								<a href="#"><span class="glyphicon glyphicon-credit-card"></span>&nbsp;&nbsp;账户中心</a>
							</li>
							<li>
								<a href="#"><span class="glyphicon glyphicon-heart"></span>&nbsp;&nbsp;我的收藏</a>
							</li>
						</ul>
					</li>
		            
		            <li><a href="#bbs"><span class="glyphicon glyphicon-off"></span>&nbsp;&nbsp;退出</a></li>
		        </ul>
		    </div>
		    </div>
		</nav>
<!--导航e-->

		<div class="container">			<!--警告框放在栅格系统中-->
			<div class="row">
				
<!--警告框s-->
				<div class="col-md-12">
					<div class="alert alert-danger alert-dismissible fade in" role="alert"> <!--fade in消失动画效果-->
						<button type="button" class="close" data-dismiss="alert" aria-label="Close"><span aria-hidden="true">×</span></button>
						<h4>网站程序有漏洞，急需修复！</h4>
						<p>当前版本程序(V1.22)存在严重安全问题，容易造成攻击，请即可修复！</p>
						<p>
							<button type="button" class="btn btn-danger">立即修复</button>
							<button type="button" class="btn btn-default" data-dismiss="alert">稍后处理</button>   <!--data-dismiss="alert"点击后，框消失-->
						</p>
					</div>
				</div>
<!--警告框e-->

<!--网站统计数据s-->
				<div class="col-md-6">   <!--下一行包含在同一个row里面-->
					<div class="panel panel-default">   <!--添加一个面板-->
						<div class="panel-heading">网站统计数据</div>
						<div class="panel-body">
							<table class="table table-hover">   <!--添加表格-->
								<thead>    <!--表头-->
									<tr>
										<th>统计项目</th>
										<th>今日</th>
										<th>昨日</th>
									</tr>
								</thead>
								<tbody>   <!--表格主体-->
									<tr>
										<th scope="row">注册会员</th>
										<td>100</td>
										<td>80</td>
									</tr>
									<tr>
										<th scope="row">登录会员</th>
										<td>1295</td>
										<td>931</td>
									</tr>
									<tr>
										<th scope="row">今日发帖</th>
										<td>1231</td>
										<td>1023</td>
									</tr>
									<tr>
										<th scope="row">转载次数</th>
										<td>1231</td>
										<td>1023</td>
									</tr>
								</tbody>
								
							</table>
						</div>
					</div>
				</div>
<!--网站统计数据e-->

<!--网站热帖s-->
				<div class="col-md-6">
					<div class="panel panel-default">
						<div class="panel-heading">网站热帖</div>  <!--为了防止边框，去掉内容区标签-->
							<ul class="list-group">   <!--添加列表组-->
								<li class="list-group-item"><a href="#"><span class="glyphicon glyphicon-list-alt"></span>&nbsp;&nbsp;泛Mooc职业教育， 效果和就业为王<small class="pull-right">2017/06/19</small></a></li>
								<li class="list-group-item"><a href="#"><span class="glyphicon glyphicon-list-alt"></span>&nbsp;&nbsp;泛Mooc职业教育， 效果和就业为王<small class="pull-right">2017/06/19</small></a></li>
								<li class="list-group-item"><a href="#"><span class="glyphicon glyphicon-list-alt"></span>&nbsp;&nbsp;泛Mooc职业教育， 效果和就业为王<small class="pull-right">2017/06/19</small></a></li>
								<li class="list-group-item"><a href="#"><span class="glyphicon glyphicon-list-alt"></span>&nbsp;&nbsp;泛Mooc职业教育， 效果和就业为王<small class="pull-right">2017/06/19</small></a></li>
								<li class="list-group-item"><a href="#"><span class="glyphicon glyphicon-list-alt"></span>&nbsp;&nbsp;泛Mooc职业教育， 效果和就业为王<small class="pull-right">2017/06/19</small></a></li>
								<li class="list-group-item"><a href="#"><span class="glyphicon glyphicon-list-alt"></span>&nbsp;&nbsp;泛Mooc职业教育， 效果和就业为王<small class="pull-right">2017/06/19</small></a></li>
							</ul>
					</div>
				</div>
<!--网站热帖e-->

<!--今日访问统计图s-->
				<div class="col-md-6">
					<div class="panel panel-default">
						<!--添加一个面板-->
						<div class="panel-heading">网站统计数据</div>
						<div class="panel-body">
							<canvas id="canvas" class="col-md-12"></canvas>
						</div>
					</div>	
				</div>
<!--今日访问统计图e-->

<!--状态进度条s-->
				<div class="col-md-6">
					<div class="panel panel-default">
						<!--添加一个面板-->
						<div class="panel-heading">服务器状态</div>
						<div class="panel-body">
							<p>内存使用率：40%</p>
							<div class="progress">
								<div class="progress-bar progress-bar-success" role="progressbar" aria-valuenow="40" aria-valuemin="0" aria-valuemax="100" style="width: 40%">
								</div>
							</div>
							<p>数据库使用率：20%</p>
							<div class="progress">
								<div class="progress-bar progress-bar-info" role="progressbar" aria-valuenow="20" aria-valuemin="0" aria-valuemax="100" style="width: 20%">
								</div>
							</div>
							<p>磁盘使用率：60%</p>
							<div class="progress">
								<div class="progress-bar progress-bar-warning" role="progressbar" aria-valuenow="60" aria-valuemin="0" aria-valuemax="100" style="width: 60%">
								</div>
							</div>
							<p>CPU使用率：80%</p>
							<div class="progress">
								<div class="progress-bar progress-bar-danger" role="progressbar" aria-valuenow="80" aria-valuemin="0" aria-valuemax="100" style="width: 80%">
								</div>
							</div>
						</div>
					</div>	
				</div>
<!--状态进度条e-->

<!--留言板s-->
				<div class="col-md-12">
					<div class="panel panel-default">
						<!--添加一个面板-->
						<div class="panel-heading">团队留言板</div>
						<div class="panel-body">
							<div class="col-md-7">
								<div class="media well"> <!-- well为边框-->
									<div class="media-left">
										<a href="#">
											<img class="media-object ph64" src="${pageContext.request.contextPath}/images/a.png" alt="卓大哥">
										</a>
									</div>
									<div class="media-body">
										<h4 class="media-heading">卓大哥</h4>
										技术大哥，今晚请把网站程序升级一下哈，现在的系统有漏洞，安全起见！
									</div>
								</div>
							
								<div class="media well">  <!--well为边框-->
									<div class="media-body text-right">
										<h4 class="media-heading">技术王</h4>
										收到，今晚凌晨2点准时升级！	
									</div>
									<div class="media-right">
										<a href="#">
											<img class="media-object ph64" src="${pageContext.request.contextPath}/images/i.png" alt="卓大哥">
										</a>
									</div>
								</div>
							
								<div class="media well">
									<div class="media-body text-right">
										<h4 class="media-heading">技术王</h4>
										你先在站点发布一下通知哈！	
									</div>
									<div class="media-right">
										<a href="#">
											<img class="media-object ph64" src="${pageContext.request.contextPath}/images/i.png" alt="卓大哥">
										</a>
									</div>
								</div>
							
								<div class="media well">
									<div class="media-left">
										<a href="#">
											<img class="media-object ph64" src="${pageContext.request.contextPath}/images/a.png" alt="卓大哥">
										</a>
									</div>
									<div class="media-body">
										<h4 class="media-heading">卓大哥</h4>
										好嘞。
									</div>
								</div>
							</div>
							
							<div class="col-md-5">
								<form action="#">
									<div class="form-group">
										<label for="text1">输入留言内容</label>
										<textarea class="form-control" id="text1" rows="5" cols="10" placeholder="请输入留言内容"></textarea>
										<button type="submit" class="btn btn-default mar_t15">留言</button>
									</div>
								</form>
								<div class="panel panel-default">
									<!--添加一个面板-->
									<div class="panel-heading">团队联系手册</div>
									<div class="panel-body">
										<ul class="list-group">
											<li class="list-group-item">站长(李小龙)：<span class="glyphicon glyphicon-phone"></span>&nbsp;&nbsp;13134848615</li>
											<li class="list-group-item">技术(大牛哥)：<span class="glyphicon glyphicon-phone"></span>&nbsp;&nbsp;13456127694</li>
											<li class="list-group-item">推广(张二哥)：<span class="glyphicon glyphicon-phone"></span>&nbsp;&nbsp;13457815482</li>
											<li class="list-group-item">客服(王女士)：<span class="glyphicon glyphicon-phone"></span>&nbsp;&nbsp;13134567782&nbsp;&nbsp;<span class="glyphicon glyphicon-phone-alt"></span>&nbsp;&nbsp;028-888888</li>

										</ul>	
									</div>
								</div>
							</div>
						</div>	
					</div>		
				</div>
<!--留言板e-->

			</div>
		</div>






<!--脚部s-->
<footer>
	<div class="container">
		<div class="row">
			<div class="col-md-12">
				<p>
					Copyright&nbsp;©&nbsp;2012-2015&nbsp;&nbsp;www.kemao666.cn&nbsp;&nbsp;蜀ICP备13014270号-4
				</p>
			</div>
		</div>		
	</div>
</footer>
<!--脚部e-->
	
	</body>
</html>




