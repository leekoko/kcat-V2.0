package cn.kcat.mapper;

import cn.kcat.pojo.YlsoftwareTitle;
import cn.kcat.pojo.YlsoftwareTitleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YlsoftwareTitleMapper {
    int countByExample(YlsoftwareTitleExample example);

    int deleteByExample(YlsoftwareTitleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(YlsoftwareTitle record);

    int insertSelective(YlsoftwareTitle record);

    List<YlsoftwareTitle> selectByExample(YlsoftwareTitleExample example);

    YlsoftwareTitle selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") YlsoftwareTitle record, @Param("example") YlsoftwareTitleExample example);

    int updateByExample(@Param("record") YlsoftwareTitle record, @Param("example") YlsoftwareTitleExample example);

    int updateByPrimaryKeySelective(YlsoftwareTitle record);

    int updateByPrimaryKey(YlsoftwareTitle record);
}