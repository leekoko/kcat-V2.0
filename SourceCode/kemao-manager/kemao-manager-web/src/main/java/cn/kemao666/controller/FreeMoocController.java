package cn.kemao666.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * leeyubin
 * 2017-11-27
 * 免费MOOC页面
 */
@Controller
@RequestMapping("/freeMooc")
public class FreeMoocController {
	/**
	 * @author liyb
	 * 2018-01-12
	 * 跳转到免费慕课页面
	 * @return
	 */
	@RequestMapping("/toFreeMooc")
	public String toFreeMooc(){
		//传 大类别
			
		return "home/freeMooc";
	}
	
	
	
	
	
	//根据大类   获取软件方法    
	//传   图片，标题，介绍文字，链接
	

}
