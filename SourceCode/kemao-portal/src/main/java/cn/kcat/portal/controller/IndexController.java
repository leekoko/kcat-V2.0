package cn.kcat.portal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	
	
	/**
	 * @author liyb
	 * 跳转到首页
	 * @return
	 */
	@RequestMapping("/index")
	public String showIndex(){
		return "index";    //默认就会进入该方法，因为web.xml配置了默认页面index.html
	}
	

	
}
