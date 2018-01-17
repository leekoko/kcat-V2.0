package cn.kcat.mapper;

import cn.kcat.pojo.Freemooc;
import cn.kcat.pojo.FreemoocExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FreemoocMapper {
    int countByExample(FreemoocExample example);

    int deleteByExample(FreemoocExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Freemooc record);

    int insertSelective(Freemooc record);

    List<Freemooc> selectByExample(FreemoocExample example);

    Freemooc selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Freemooc record, @Param("example") FreemoocExample example);

    int updateByExample(@Param("record") Freemooc record, @Param("example") FreemoocExample example);

    int updateByPrimaryKeySelective(Freemooc record);

    int updateByPrimaryKey(Freemooc record);
}