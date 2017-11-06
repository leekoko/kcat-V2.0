package cn.kcat.mapper;

import cn.kcat.pojo.Zysoftware;
import cn.kcat.pojo.ZysoftwareExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ZysoftwareMapper {
    int countByExample(ZysoftwareExample example);

    int deleteByExample(ZysoftwareExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Zysoftware record);

    int insertSelective(Zysoftware record);

    List<Zysoftware> selectByExample(ZysoftwareExample example);

    Zysoftware selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Zysoftware record, @Param("example") ZysoftwareExample example);

    int updateByExample(@Param("record") Zysoftware record, @Param("example") ZysoftwareExample example);

    int updateByPrimaryKeySelective(Zysoftware record);

    int updateByPrimaryKey(Zysoftware record);
}