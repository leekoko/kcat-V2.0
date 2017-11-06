package cn.kcat.mapper;

import cn.kcat.pojo.ZysoftwareTitleb;
import cn.kcat.pojo.ZysoftwareTitlebExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ZysoftwareTitlebMapper {
    int countByExample(ZysoftwareTitlebExample example);

    int deleteByExample(ZysoftwareTitlebExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ZysoftwareTitleb record);

    int insertSelective(ZysoftwareTitleb record);

    List<ZysoftwareTitleb> selectByExample(ZysoftwareTitlebExample example);

    ZysoftwareTitleb selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ZysoftwareTitleb record, @Param("example") ZysoftwareTitlebExample example);

    int updateByExample(@Param("record") ZysoftwareTitleb record, @Param("example") ZysoftwareTitlebExample example);

    int updateByPrimaryKeySelective(ZysoftwareTitleb record);

    int updateByPrimaryKey(ZysoftwareTitleb record);
}