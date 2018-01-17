package cn.kcat.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 页面跳转Controller
 * @author liyb
 */
@Controller
public class PageController {
	/**
	 * @author liyb
	 * 2018-01-12
	 * 跳转到首页
	 * @return
	 */
	@RequestMapping("/")
	public String showIndex(){
		return "home/index";
	}
	/**
	 * 打开其他页面
	 */
	@RequestMapping("/{page}")
	public String showPage(@PathVariable String page){
		return "/home/"+page;
	}	
	
}
