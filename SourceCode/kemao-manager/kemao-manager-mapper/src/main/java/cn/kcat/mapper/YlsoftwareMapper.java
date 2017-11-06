package cn.kcat.mapper;

import cn.kcat.pojo.Ylsoftware;
import cn.kcat.pojo.YlsoftwareExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YlsoftwareMapper {
    int countByExample(YlsoftwareExample example);

    int deleteByExample(YlsoftwareExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Ylsoftware record);

    int insertSelective(Ylsoftware record);

    List<Ylsoftware> selectByExample(YlsoftwareExample example);

    Ylsoftware selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Ylsoftware record, @Param("example") YlsoftwareExample example);

    int updateByExample(@Param("record") Ylsoftware record, @Param("example") YlsoftwareExample example);

    int updateByPrimaryKeySelective(Ylsoftware record);

    int updateByPrimaryKey(Ylsoftware record);
}