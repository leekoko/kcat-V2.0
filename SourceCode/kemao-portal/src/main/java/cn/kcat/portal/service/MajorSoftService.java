package cn.kcat.portal.service;

import java.util.List;

import cn.kcat.pojo.Majorsoft;

public interface MajorSoftService {
	public List<Majorsoft> getSoftByMajorCode(String majorCode);
}
