package cn.kcat.mapper;

import cn.kcat.pojo.Soft;
import cn.kcat.pojo.SoftExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SoftMapper {
    int countByExample(SoftExample example);

    int deleteByExample(SoftExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Soft record);

    int insertSelective(Soft record);

    List<Soft> selectByExample(SoftExample example);

    Soft selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Soft record, @Param("example") SoftExample example);

    int updateByExample(@Param("record") Soft record, @Param("example") SoftExample example);

    int updateByPrimaryKeySelective(Soft record);

    int updateByPrimaryKey(Soft record);
}