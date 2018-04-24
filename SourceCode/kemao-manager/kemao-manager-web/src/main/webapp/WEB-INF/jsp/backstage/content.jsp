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
		            <li><a href="index.html"><span class="glyphicon glyphicon-home"></span>&nbsp;&nbsp;后台首页</a></li>
		            <li><a href="user_list.html"><span class="glyphicon glyphicon-user"></span>&nbsp;&nbsp;用户管理</a></li>
		            <li class="active"><a href="content.html"><span class="glyphicon glyphicon-list-alt"></span>&nbsp;&nbsp;内容管理</a></li>
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


	<div class="container">
			<div class="row">
<!--用户列表小导航s-->
				<div class="col-md-2">
					<div class="list-group">
						<a href="${pageContext.request.contextPath}/content" class="list-group-item active">管理文章</a>
						<a href="content_post.html" class="list-group-item">添加文章</a>

					</div>
				</div>
<!--用户列表小导航e-->

<!--用户列表内容s-->
				<div class="col-md-10">
					<div class="page-header">
						<h1>文章管理</h1>
					</div>
					<ul class="nav nav-tabs">
						<li class="active">
							<a href="content.html">文章列表</a>
						</li>
						<li>
							<a href="content_post.html">文章列表</a>
						</li>
					</ul>
					<table class="table">
						<thead>
							<tr>
								<th>文章标题</th>
								<th>作者</th>
								<th>发布时间</th>
								<th>操作</th>
							</tr>
						</thead>
						<tbody>
							<tr>
								<th scope="row">泛Mooc职业教育， 效果和就业为王</th>
								<td>张三</td>
								<td>2015/08/08</td>
								<td>  
									<div role="presentation" class="dropdown">   <!--修改为div-->
									    <button class="btn btn-default dropdown-toggle" data-toggle="dropdown" href="#" role="button" aria-haspopup="true" aria-expanded="false">操作<span class="caret"></span>  <!-- 修改为button-->
									    </button>
									    <ul class="dropdown-menu">
									    		<li><a href="#">编辑</a></li>
									    		<li><a href="#">删除</a></li>
									    		<li><a href="#">全局置顶</a></li>
									    </ul>
								  	</div>
								</td>
							</tr>
							<tr>
								<th scope="row">产品经理常犯的7大错误，你造吗？</th>
								<td>李四</td>
								<td>2017/06/21</td>
								<td>
									<div role="presentation" class="dropdown">
										<!--修改为div-->
										<button class="btn btn-default dropdown-toggle" data-toggle="dropdown" href="#" role="button" aria-haspopup="true" aria-expanded="false">操作<span class="caret"></span>  <!-- 修改为button-->
									    </button>
									    <ul class="dropdown-menu">
									    		<li><a href="#">编辑</a></li>
									    		<li><a href="#">删除</a></li>
									    		<li><a href="#">全局置顶</a></li>
									    </ul>
									</div>
								</td>
							</tr>
							<tr>
								<th scope="row">如何正确使用python日志系统</th>
								<td>李宇斌</td>
								<td>2017/06/21</td>
								<td>
									<div role="presentation" class="dropdown">
										<!--修改为div-->
										<button class="btn btn-default dropdown-toggle" data-toggle="dropdown" href="#" role="button" aria-haspopup="true" aria-expanded="false">操作<span class="caret"></span>  <!-- 修改为button-->
									    </button>
									    <ul class="dropdown-menu">
									    		<li><a href="#">编辑</a></li>
									    		<li><a href="#">删除</a></li>
									    		<li><a href="#">全局置顶</a></li>
									    </ul>
									</div>
								</td>
							</tr>
							<tr>
								<th scope="row">C语言const修饰符的怎么使用？</th>
								<td>李宇斌</td>
								<td>2017/06/21</td>
								<td>
									<div role="presentation" class="dropdown">
										<!--修改为div-->
										<button class="btn btn-default dropdown-toggle" data-toggle="dropdown" href="#" role="button" aria-haspopup="true" aria-expanded="false">操作<span class="caret"></span>  <!-- 修改为button-->
									    </button>
									    <ul class="dropdown-menu">
									    		<li><a href="#">编辑</a></li>
									    		<li><a href="#">删除</a></li>
									    		<li><a href="#">全局置顶</a></li>
									    </ul>
									</div>
								</td>
							</tr>
							<tr>
								<th scope="row">C语言const修饰符的怎么使用？</th>
								<td>李宇斌</td>
								<td>2017/06/21</td>
								<td>
									<div role="presentation" class="dropdown">
										<!--修改为div-->
										<button class="btn btn-default dropdown-toggle" data-toggle="dropdown" href="#" role="button" aria-haspopup="true" aria-expanded="false">操作<span class="caret"></span>  <!-- 修改为button-->
									    </button>
									    <ul class="dropdown-menu">
									    		<li><a href="#">编辑</a></li>
									    		<li><a href="#">删除</a></li>
									    		<li><a href="#">全局置顶</a></li>
									    </ul>
									</div>
								</td>
							</tr>
							<tr>
								<th scope="row">C语言const修饰符的怎么使用？</th>
								<td>李宇斌</td>
								<td>2017/06/21</td>
								<td>
									<div role="presentation" class="dropdown">
										<!--修改为div-->
										<button class="btn btn-default dropdown-toggle" data-toggle="dropdown" href="#" role="button" aria-haspopup="true" aria-expanded="false">操作<span class="caret"></span>  <!-- 修改为button-->
									    </button>
									    <ul class="dropdown-menu">
									    		<li><a href="#">编辑</a></li>
									    		<li><a href="#">删除</a></li>
									    		<li><a href="#">全局置顶</a></li>
									    </ul>
									</div>
								</td>
							</tr>
							<tr>
								<th scope="row">C语言const修饰符的怎么使用？</th>
								<td>李宇斌</td>
								<td>2017/06/21</td>
								<td>
									<div role="presentation" class="dropdown">
										<!--修改为div-->
										<button class="btn btn-default dropdown-toggle" data-toggle="dropdown" href="#" role="button" aria-haspopup="true" aria-expanded="false">操作<span class="caret"></span>  <!-- 修改为button-->
									    </button>
									    <ul class="dropdown-menu">
									    		<li><a href="#">编辑</a></li>
									    		<li><a href="#">删除</a></li>
									    		<li><a href="#">全局置顶</a></li>
									    </ul>
									</div>
								</td>
							</tr>
							<tr>
								<th scope="row">怎样才能成为优秀的iOS开发工程师</th>
								<td>李宇斌</td>
								<td>2017/06/21</td>
								<td>
									<div role="presentation" class="dropdown">
										<!--修改为div-->
										<button class="btn btn-default dropdown-toggle" data-toggle="dropdown" href="#" role="button" aria-haspopup="true" aria-expanded="false">操作<span class="caret"></span>  <!-- 修改为button-->
										</button>
									    <ul class="dropdown-menu">
									    		<li><a href="#">编辑</a></li>
									    		<li><a href="#">删除</a></li>
									    		<li><a href="#">全局置顶</a></li>
									    </ul>
									</div>
								</td>
							</tr>
						</tbody>
					</table>
					<!--导航内容-->
					<nav aria-label="Page navigation" class="pull-right">
						<ul class="pagination">
							<li>
								<a href="#" aria-label="Previous">
									<span aria-hidden="true">&laquo;</span>
								</a>
							</li>
							<li>
								<a href="#">1</a>
							</li>
							<li>
								<a href="#">2</a>
							</li>
							<li>
								<a href="#">3</a>
							</li>
							<li>
								<a href="#">4</a>
							</li>
							<li>
								<a href="#">5</a>
							</li>
							<li>
								<a href="#" aria-label="Next">
									<span aria-hidden="true">&raquo;</span>
								</a>
							</li>
						</ul>
					</nav>
					
				</div>
<!--用户列表内容e-->

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




