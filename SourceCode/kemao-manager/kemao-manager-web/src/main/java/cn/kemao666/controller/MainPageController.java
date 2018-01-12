package cn.kemao666.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * leeyubin
 * 2017-11-27
 * 首页
 */
@Controller
public class MainPageController {
	/**
	 * @author liyb
	 * 2018-01-12
	 * 跳转到首页
	 * @return
	 */
	@RequestMapping("/")
	public String toMajorSoft(){
		return "home/index";
	}
	
	
	

}
