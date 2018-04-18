package cn.kcat.mapper;

import cn.kcat.pojo.MajorToMajorsoft;
import cn.kcat.pojo.MajorToMajorsoftExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MajorToMajorsoftMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table major_to_majorsoft
     *
     * @mbggenerated Wed Apr 18 22:27:57 SGT 2018
     */
    int countByExample(MajorToMajorsoftExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table major_to_majorsoft
     *
     * @mbggenerated Wed Apr 18 22:27:57 SGT 2018
     */
    int deleteByExample(MajorToMajorsoftExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table major_to_majorsoft
     *
     * @mbggenerated Wed Apr 18 22:27:57 SGT 2018
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table major_to_majorsoft
     *
     * @mbggenerated Wed Apr 18 22:27:57 SGT 2018
     */
    int insert(MajorToMajorsoft record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table major_to_majorsoft
     *
     * @mbggenerated Wed Apr 18 22:27:57 SGT 2018
     */
    int insertSelective(MajorToMajorsoft record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table major_to_majorsoft
     *
     * @mbggenerated Wed Apr 18 22:27:57 SGT 2018
     */
    List<MajorToMajorsoft> selectByExample(MajorToMajorsoftExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table major_to_majorsoft
     *
     * @mbggenerated Wed Apr 18 22:27:57 SGT 2018
     */
    MajorToMajorsoft selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table major_to_majorsoft
     *
     * @mbggenerated Wed Apr 18 22:27:57 SGT 2018
     */
    int updateByExampleSelective(@Param("record") MajorToMajorsoft record, @Param("example") MajorToMajorsoftExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table major_to_majorsoft
     *
     * @mbggenerated Wed Apr 18 22:27:57 SGT 2018
     */
    int updateByExample(@Param("record") MajorToMajorsoft record, @Param("example") MajorToMajorsoftExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table major_to_majorsoft
     *
     * @mbggenerated Wed Apr 18 22:27:57 SGT 2018
     */
    int updateByPrimaryKeySelective(MajorToMajorsoft record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table major_to_majorsoft
     *
     * @mbggenerated Wed Apr 18 22:27:57 SGT 2018
     */
    int updateByPrimaryKey(MajorToMajorsoft record);
}