package cn.kcat.mapper;

import cn.kcat.pojo.BangTitle;
import cn.kcat.pojo.BangTitleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BangTitleMapper {
    int countByExample(BangTitleExample example);

    int deleteByExample(BangTitleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BangTitle record);

    int insertSelective(BangTitle record);

    List<BangTitle> selectByExample(BangTitleExample example);

    BangTitle selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BangTitle record, @Param("example") BangTitleExample example);

    int updateByExample(@Param("record") BangTitle record, @Param("example") BangTitleExample example);

    int updateByPrimaryKeySelective(BangTitle record);

    int updateByPrimaryKey(BangTitle record);
}