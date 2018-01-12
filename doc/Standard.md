# 规范   

1. 每个模块一个Controller，Controller的名称为``XXXController``,其类跳转名称为``XXX``   

   ```java
   @Controller
   @RequestMapping("/majorSoft")
   public class MajorSoftController {...
   ```

2. 当跳转的为页面时，名称为``toXXX``,XXX为jsp的名称    

   ```java
   	@RequestMapping("toMajorSoft")
   	public String toMajorSoft(){	
   		return "home/majorSoft";
   	}
   ```

3. 每个类上面添加开发者的相关注解信息(作者、事件、功能描述)：

   ```java
   /**
    * @author leeyubin
    * @date 2017-11-27
    * 专业软件Controller
    */
   ```

   ​

