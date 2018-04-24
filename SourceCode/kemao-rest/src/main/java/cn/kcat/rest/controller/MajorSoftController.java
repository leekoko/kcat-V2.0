package cn.kcat.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.kcat.common.pojo.KCatResult;
import cn.kcat.common.utils.ExceptionUtil;
import cn.kcat.mapper.MajorsoftMapper;
import cn.kcat.pojo.Majorsoft;

@Controller
@RequestMapping("/majorSoft")
public class MajorSoftController {
	@Autowired
	MajorsoftMapper majorsoftMapper;
	
	@RequestMapping("/getSoftByMajorCode/{majorCode}")
	@ResponseBody
	public KCatResult getSoftByMajorCode(@PathVariable String majorCode){
		try {
			List<Majorsoft> softList = majorsoftMapper.getSoftByMajorCode(majorCode);
			return KCatResult.ok(softList);
		} catch (Exception e) {
			e.printStackTrace();
			return KCatResult
					.build(500, ExceptionUtil.getStackTrace(e));  //出错状态码,错误消息 
		}
	}
	
}
