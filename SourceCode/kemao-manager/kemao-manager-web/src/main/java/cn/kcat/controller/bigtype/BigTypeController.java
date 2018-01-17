package cn.kcat.controller.bigtype;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.kcat.pojo.Bigtype;
import cn.kcat.service.BigtypeService;


/**
 * 慕课视频大类别Controller
 * @author liyb
 *
 */
@Controller
public class BigTypeController {
	@Autowired
	private BigtypeService bigtypeService;
    /**
     * 获取慕课视频大类别
     * @return
     */
	@ResponseBody
    @RequestMapping(value = "getBigtypeList")
	public List<Bigtype> getBigtypeList() {
		List<Bigtype> bigtypeList = bigtypeService.getBigtypeList();
		return bigtypeList;
	}
	
}
