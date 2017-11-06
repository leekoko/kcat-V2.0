package cn.kcat.mapper;

import cn.kcat.pojo.ZysoftwareTitles;
import cn.kcat.pojo.ZysoftwareTitlesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ZysoftwareTitlesMapper {
    int countByExample(ZysoftwareTitlesExample example);

    int deleteByExample(ZysoftwareTitlesExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ZysoftwareTitles record);

    int insertSelective(ZysoftwareTitles record);

    List<ZysoftwareTitles> selectByExample(ZysoftwareTitlesExample example);

    ZysoftwareTitles selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ZysoftwareTitles record, @Param("example") ZysoftwareTitlesExample example);

    int updateByExample(@Param("record") ZysoftwareTitles record, @Param("example") ZysoftwareTitlesExample example);

    int updateByPrimaryKeySelective(ZysoftwareTitles record);

    int updateByPrimaryKey(ZysoftwareTitles record);
}