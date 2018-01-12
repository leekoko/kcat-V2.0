# 添加代码规则   

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

   ​







