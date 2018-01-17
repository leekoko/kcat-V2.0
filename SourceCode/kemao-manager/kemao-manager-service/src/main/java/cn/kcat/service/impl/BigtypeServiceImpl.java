package cn.kcat.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.kcat.mapper.BigtypeMapper;
import cn.kcat.pojo.Bigtype;
import cn.kcat.pojo.BigtypeExample;
import cn.kcat.service.BigtypeService;
@Service
public class BigtypeServiceImpl implements BigtypeService{
	@Autowired
	private BigtypeMapper bigtypeMapper;

	@Override
	public List<Bigtype> getBigtypeList() {
		BigtypeExample example = new BigtypeExample();
		return bigtypeMapper.selectByExample(example);
	}
	
}
