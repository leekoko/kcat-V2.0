# kcat记录   

##  1.添加Controller跳转    

### 1.先前的配置

```java
	<context:component-scan base-package="cn.kemao666.controller" />
	<mvc:annotation-driven />
	<bean
		class="org.springframework.web.servlet.view.InternalResourceViewResolver">
		<property name="prefix" value="/WEB-INF/jsp/" />
		<property name="suffix" value=".jsp" />
	</bean>
```

1. 在springmvc.xml中添加了包扫描器。springmvc就会自动去扫描该包下的类，执行其对应方法。    
2. 开启注解   
3. 视图解析器：return跳转的自动补全

### 2.通用的添加      

1. springmvc.xml中配置扫描的controller包

   ``<context:component-scan base-package="cn.kemao666.controller" />``   

2. 前端对请求的方法进行访问   

   ```java
   <p class="btnbar"><a class="btn-buy" href="${pageContext.request.contextPath}/majorSoft/toMajorSoft" target="_parent"><span class="paddingW"></span>点击进入&gt;&gt;</a></p>
   ```

3. Controller部分添加注解接收访问

   ```java
   @Controller
   @RequestMapping("/majorSoft")
   public class MajorSoftController {
   	@RequestMapping("toMajorSoft")
   	public String toMajorSoft(){
   		return "home/majorSoft";
   	}
   }
   ```

   跳转页面不能添加``@ResponBody``注解



### 学习软件页面显示   

D:现在要实现的就是使用bootstrap把静态的软件列表展示做出来。

Z:首先是要将通用的js提取出来。

M:要引入js文件，最好使用动态获取的绝对路径，但是怎么获取到当前文件的路径呢？

Z:使用request获取到地址，并且存入kcat中，jsp中就可以通过``${kcat}``拿到。

```html
<%
pageContext.setAttribute("kcat", request.getContextPath());
%>   
```

M:但是为什么我测试打印不出地址呢？

Z:1. 通过ip得到jsp不是tomcat的默认页面。所以获取字符串为空，它获得的是虚目录。

2. 也可以通过``<c:set var="ctxStatic" value="${pageContext.request.contextPath}/static"/>``设置。
3. 通过``${pageContext.request.contextPath}``也能直接获取到，这里暂时使用最简单的方法。






