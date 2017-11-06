package cn.kcat.mapper;

import cn.kcat.pojo.ZuoyefuzhuCg;
import cn.kcat.pojo.ZuoyefuzhuCgExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ZuoyefuzhuCgMapper {
    int countByExample(ZuoyefuzhuCgExample example);

    int deleteByExample(ZuoyefuzhuCgExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ZuoyefuzhuCg record);

    int insertSelective(ZuoyefuzhuCg record);

    List<ZuoyefuzhuCg> selectByExample(ZuoyefuzhuCgExample example);

    ZuoyefuzhuCg selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ZuoyefuzhuCg record, @Param("example") ZuoyefuzhuCgExample example);

    int updateByExample(@Param("record") ZuoyefuzhuCg record, @Param("example") ZuoyefuzhuCgExample example);

    int updateByPrimaryKeySelective(ZuoyefuzhuCg record);

    int updateByPrimaryKey(ZuoyefuzhuCg record);
}