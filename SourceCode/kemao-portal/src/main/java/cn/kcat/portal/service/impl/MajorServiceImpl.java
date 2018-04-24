package cn.kcat.portal.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import cn.kcat.common.pojo.KCatResult;
import cn.kcat.common.utils.HttpClientUtil;
import cn.kcat.pojo.Major;
import cn.kcat.portal.service.MajorService;

@Service
public class MajorServiceImpl implements MajorService{
	
	@Value("${REST_BASE_URL}")
	private String REST_BASE_URL;
	@Value("${GET_MAJOR}")
	private String GET_MAJOR;
	
	@Override
	public List<Major> getMajor() {
		//调用服务层的服务
		String result = HttpClientUtil.doGet(REST_BASE_URL + GET_MAJOR);
		try{
			KCatResult kCatResult = KCatResult.formatToList(result, Major.class);
			//取内容列表
			List<Major> list = (List<Major>)kCatResult.getData();
			return list;
		}catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}
	
	
}
