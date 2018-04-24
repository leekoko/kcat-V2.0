package cn.kcat.portal.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import cn.kcat.common.pojo.KCatResult;
import cn.kcat.common.utils.HttpClientUtil;
import cn.kcat.pojo.Majorsoft;
import cn.kcat.portal.service.MajorSoftService;
@Service
public class MajorSoftServiceImpl implements MajorSoftService {
	
	@Value("${REST_BASE_URL}")
	private String REST_BASE_URL;
	@Value("${GET_SOFT_BY_MAJOR_CODE}")
	private String GET_SOFT_BY_MAJOR_CODE;
	
	@Override
	public List<Majorsoft> getSoftByMajorCode(String majorCode) {
		//调用服务层的服务
		String result = HttpClientUtil.doGet(REST_BASE_URL + GET_SOFT_BY_MAJOR_CODE + majorCode);
		try{
			KCatResult kCatResult = KCatResult.formatToList(result, Majorsoft.class);
			//取内容列表
			List<Majorsoft> list = (List<Majorsoft>)kCatResult.getData();
			return list;
		}catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}

}
