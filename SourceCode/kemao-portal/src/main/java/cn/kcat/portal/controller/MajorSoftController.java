package cn.kcat.portal.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.kcat.common.utils.Tools;
import cn.kcat.pojo.Major;
import cn.kcat.pojo.Majorsoft;
import cn.kcat.portal.service.MajorService;
import cn.kcat.portal.service.MajorSoftService;

@Controller
public class MajorSoftController {
	
	@Autowired
	private MajorService majorService;
	@Autowired
	private MajorSoftService majorSoftService;
	
	
	/**
	 * 跳转到专业软件页面
	 * 2018-04-18
	 * @param model
	 * @return
	 */
	@RequestMapping("/majorSoft")
	public String showPage(Model model){
		List<Major> majorList = majorService.getMajor();
		ArrayList<String> majorNames = new ArrayList<String>();
		for (Major major : majorList) {
			majorNames.add(major.getMajorname());
		}
		if(Tools.isNotEmpty(majorList)) {
			model.addAttribute("major", majorNames);
		}
		ArrayList<ArrayList<String>> softwareLists = new ArrayList<ArrayList<String>>();
		for (Major major : majorList) {
			List<Majorsoft> softList = majorSoftService.getSoftByMajorCode(major.getId());
			ArrayList<String> softNames = new ArrayList<String>();
			for (Majorsoft soft : softList) {
				softNames.add(soft.getTitle());
			}
			softwareLists.add(softNames);
		}
		model.addAttribute("softwareLists", softwareLists);
		return "majorSoft";
	}	
}
