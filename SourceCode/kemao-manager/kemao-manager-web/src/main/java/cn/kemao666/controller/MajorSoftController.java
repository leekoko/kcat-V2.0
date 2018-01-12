package cn.kemao666.controller;
import java.util.ArrayList;

/**
 * @author leeyubin
 * @date 2017-11-27
 * 专业软件Controller
 */
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
/**
 * @author liyb
 * 专业软件类
 */
@Controller
@RequestMapping("/majorSoft")
public class MajorSoftController {
	/**
	 * @author liyb
	 * 2018-01-12
	 * 跳转到专业软件界面
	 * @return
	 */
	@RequestMapping("toMajorSoft")
	public String toMajorSoft(){
		return "home/majorSoft";
	}
	
	
	/**
	 * 获取XXX
	 * @return
	 */
	

}
