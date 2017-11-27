package cn.kemao666.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/mainPage")
public class MainPageController {
	@RequestMapping("zhuanyeruanjian")
	public String getItemById(){
		
		return "home/zhuanyeruanjian";
	}
	

}
