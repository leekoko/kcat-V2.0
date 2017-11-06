package cn.kcat.mapper;

import cn.kcat.pojo.Zuoyefuzhu;
import cn.kcat.pojo.ZuoyefuzhuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ZuoyefuzhuMapper {
    int countByExample(ZuoyefuzhuExample example);

    int deleteByExample(ZuoyefuzhuExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Zuoyefuzhu record);

    int insertSelective(Zuoyefuzhu record);

    List<Zuoyefuzhu> selectByExample(ZuoyefuzhuExample example);

    Zuoyefuzhu selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Zuoyefuzhu record, @Param("example") ZuoyefuzhuExample example);

    int updateByExample(@Param("record") Zuoyefuzhu record, @Param("example") ZuoyefuzhuExample example);

    int updateByPrimaryKeySelective(Zuoyefuzhu record);

    int updateByPrimaryKey(Zuoyefuzhu record);
}