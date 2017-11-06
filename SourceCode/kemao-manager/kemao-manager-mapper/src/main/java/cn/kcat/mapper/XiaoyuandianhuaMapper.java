package cn.kcat.mapper;

import cn.kcat.pojo.Xiaoyuandianhua;
import cn.kcat.pojo.XiaoyuandianhuaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XiaoyuandianhuaMapper {
    int countByExample(XiaoyuandianhuaExample example);

    int deleteByExample(XiaoyuandianhuaExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Xiaoyuandianhua record);

    int insertSelective(Xiaoyuandianhua record);

    List<Xiaoyuandianhua> selectByExample(XiaoyuandianhuaExample example);

    Xiaoyuandianhua selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Xiaoyuandianhua record, @Param("example") XiaoyuandianhuaExample example);

    int updateByExample(@Param("record") Xiaoyuandianhua record, @Param("example") XiaoyuandianhuaExample example);

    int updateByPrimaryKeySelective(Xiaoyuandianhua record);

    int updateByPrimaryKey(Xiaoyuandianhua record);
}