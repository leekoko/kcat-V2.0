package cn.kcat.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import cn.kcat.common.pojo.KCatResult;
import cn.kcat.common.utils.ExceptionUtil;
import cn.kcat.mapper.MajorMapper;
import cn.kcat.pojo.Major;
import cn.kcat.pojo.MajorExample;

@Controller
@RequestMapping("/major")
public class MajorController {
	
	@Autowired
	MajorMapper majorMapper;
	
	@RequestMapping("/getMajor")
	@ResponseBody
	public KCatResult getContentList(){
		try {
			MajorExample majorExample = new MajorExample();
			List<Major> majorList = majorMapper.selectByExample(majorExample);
			return KCatResult.ok(majorList);
		} catch (Exception e) {
			e.printStackTrace();
			return KCatResult
					.build(500, ExceptionUtil.getStackTrace(e));  //出错状态码,错误消息 
		}
	}

}
