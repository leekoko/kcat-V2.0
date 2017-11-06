package cn.kcat.mapper;

import cn.kcat.pojo.Bang;
import cn.kcat.pojo.BangExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BangMapper {
    int countByExample(BangExample example);

    int deleteByExample(BangExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Bang record);

    int insertSelective(Bang record);

    List<Bang> selectByExample(BangExample example);

    Bang selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Bang record, @Param("example") BangExample example);

    int updateByExample(@Param("record") Bang record, @Param("example") BangExample example);

    int updateByPrimaryKeySelective(Bang record);

    int updateByPrimaryKey(Bang record);
}