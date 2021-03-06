package cn.kcat.mapper;

import cn.kcat.pojo.Majorsoft;
import cn.kcat.pojo.MajorsoftExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MajorsoftMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table majorsoft
     *
     * @mbggenerated Wed Apr 18 22:27:57 SGT 2018
     */
    int countByExample(MajorsoftExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table majorsoft
     *
     * @mbggenerated Wed Apr 18 22:27:57 SGT 2018
     */
    int deleteByExample(MajorsoftExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table majorsoft
     *
     * @mbggenerated Wed Apr 18 22:27:57 SGT 2018
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table majorsoft
     *
     * @mbggenerated Wed Apr 18 22:27:57 SGT 2018
     */
    int insert(Majorsoft record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table majorsoft
     *
     * @mbggenerated Wed Apr 18 22:27:57 SGT 2018
     */
    int insertSelective(Majorsoft record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table majorsoft
     *
     * @mbggenerated Wed Apr 18 22:27:57 SGT 2018
     */
    List<Majorsoft> selectByExample(MajorsoftExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table majorsoft
     *
     * @mbggenerated Wed Apr 18 22:27:57 SGT 2018
     */
    Majorsoft selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table majorsoft
     *
     * @mbggenerated Wed Apr 18 22:27:57 SGT 2018
     */
    int updateByExampleSelective(@Param("record") Majorsoft record, @Param("example") MajorsoftExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table majorsoft
     *
     * @mbggenerated Wed Apr 18 22:27:57 SGT 2018
     */
    int updateByExample(@Param("record") Majorsoft record, @Param("example") MajorsoftExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table majorsoft
     *
     * @mbggenerated Wed Apr 18 22:27:57 SGT 2018
     */
    int updateByPrimaryKeySelective(Majorsoft record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table majorsoft
     *
     * @mbggenerated Wed Apr 18 22:27:57 SGT 2018
     */
    int updateByPrimaryKey(Majorsoft record);
    
    /**
     *2018-4-18 
     *根据专业Code获取软件 
     */
    List<Majorsoft> getSoftByMajorCode(@Param("majorCode")String majorCode); 
    
}