package cn.kcat.mapper;

import cn.kcat.pojo.XiaoyuandianhuaCg;
import cn.kcat.pojo.XiaoyuandianhuaCgExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XiaoyuandianhuaCgMapper {
    int countByExample(XiaoyuandianhuaCgExample example);

    int deleteByExample(XiaoyuandianhuaCgExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(XiaoyuandianhuaCg record);

    int insertSelective(XiaoyuandianhuaCg record);

    List<XiaoyuandianhuaCg> selectByExample(XiaoyuandianhuaCgExample example);

    XiaoyuandianhuaCg selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") XiaoyuandianhuaCg record, @Param("example") XiaoyuandianhuaCgExample example);

    int updateByExample(@Param("record") XiaoyuandianhuaCg record, @Param("example") XiaoyuandianhuaCgExample example);

    int updateByPrimaryKeySelective(XiaoyuandianhuaCg record);

    int updateByPrimaryKey(XiaoyuandianhuaCg record);
}