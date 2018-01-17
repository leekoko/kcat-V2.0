package cn.kcat.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.kcat.mapper.FreemoocMapper;
import cn.kcat.pojo.Freemooc;
import cn.kcat.pojo.FreemoocExample;
import cn.kcat.pojo.FreemoocExample.Criteria;
import cn.kcat.service.FreeMoocService;
@Service
public class FreeMoocServiceImpl implements FreeMoocService {
	@Autowired
	private FreemoocMapper freemoocMapper;
	
	@Override
	public List<Freemooc> getFreeMoocList(int id) {
		FreemoocExample example = new FreemoocExample();
		Criteria criteria = example.createCriteria();
		criteria.andParentidEqualTo(id);
		return freemoocMapper.selectByExample(example);
	}

}
