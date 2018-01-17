package cn.kcat.controller.freemooc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.kcat.pojo.Bigtype;
import cn.kcat.pojo.Freemooc;
import cn.kcat.service.BigtypeService;
import cn.kcat.service.FreeMoocService;
/**
 * 慕课视频Controller
 * @author liyb
 *
 */
@Controller
public class freeMoocController {
	@Autowired
	private FreeMoocService freeMoocService;
    @ResponseBody
    @RequestMapping(value = "getFreeMoocList")
	public List<Freemooc> getFreeMoocList(@RequestParam(value="parentId")int parentId) {
		List<Freemooc> freemoocList = freeMoocService.getFreeMoocList(parentId);
		for (int i = 0; i < freemoocList.size(); i++) {
			System.out.println(freemoocList.get(i).getTitle());
		}
		return freemoocList;
	}
}
