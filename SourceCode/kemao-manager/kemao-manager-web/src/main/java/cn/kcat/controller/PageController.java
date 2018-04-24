package cn.kcat.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.kcat.common.utils.Tools;
import cn.kcat.mapper.MajorMapper;
import cn.kcat.mapper.MajorToMajorsoftMapper;
import cn.kcat.mapper.MajorsoftMapper;
import cn.kcat.pojo.Major;
import cn.kcat.pojo.MajorExample;
import cn.kcat.pojo.MajorToMajorsoft;
import cn.kcat.pojo.MajorToMajorsoftExample;
import cn.kcat.pojo.MajorToMajorsoftExample.Criteria;
import cn.kcat.pojo.Majorsoft;
import cn.kcat.pojo.MajorsoftExample;

/**
 * 页面跳转Controller
 * @author liyb
 */
@Controller
public class PageController {

	/**
	 * 跳转到专业软件页面
	 * 2018-04-18
	 * @param model
	 * @return
	 */
/*	@RequestMapping("/majorSoft")
	public String showPage(Model model){
		
		MajorExample majorExample = new MajorExample();
		List<Major> majorList = majorMapper.selectByExample(majorExample);
		ArrayList<String> majorNames = new ArrayList<String>();
		for (Major major : majorList) {
			majorNames.add(major.getMajorname());
		}
		if(Tools.isNotEmpty(majorList)) {
			model.addAttribute("major", majorNames);
		}

		ArrayList<ArrayList<String>> softwareLists = new ArrayList<ArrayList<String>>();
		for (Major major : majorList) {
			List<Majorsoft> softList = majorsoftMapper.getSoftByMajorCode(major.getId());
			ArrayList<String> softNames = new ArrayList<String>();
			for (Majorsoft soft : softList) {
				softNames.add(soft.getTitle());
			}
			softwareLists.add(softNames);
		}
		
		model.addAttribute("softwareLists", softwareLists);
		return "home/majorSoft";
	}	*/
	
	
	
	//---------后台页面-------------------
	/**
	 * 跳转到后台首页
	 * @return
	 */
	@RequestMapping("/")
	public String toAdminIndex(){
		return "backstage/index";
	}
	
	/**
	 * 跳转到内容管理页
	 * @return
	 */
	@RequestMapping("/content")
	public String toContent(){
		return "backstage/content";
	}
	
	/**
	 * 打开其他页面
	 */
	@RequestMapping("/{page}")
	public String showPage(@PathVariable String page){
		return "/backstage/"+page;
	}	
	
}
