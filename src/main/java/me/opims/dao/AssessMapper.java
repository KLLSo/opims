package me.opims.dao;

import me.opims.model.Assess;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface AssessMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table assess
     *
     * @mbggenerated
     */
    @Delete({
        "delete from assess",
        "where id_assess = #{idAssess,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer idAssess);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table assess
     *
     * @mbggenerated
     */
    @Insert({
        "insert into assess (id_assess, content, ",
        "assesser, time_assess)",
        "values (#{idAssess,jdbcType=INTEGER}, #{content,jdbcType=VARCHAR}, ",
        "#{assesser,jdbcType=VARCHAR}, #{timeAssess,jdbcType=DATE})"
    })
    int insert(Assess record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table assess
     *
     * @mbggenerated
     */
    int insertSelective(Assess record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table assess
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "id_assess, content, assesser, time_assess",
        "from assess",
        "where id_assess = #{idAssess,jdbcType=INTEGER}"
    })
    @ResultMap("BaseResultMap")
    Assess selectByPrimaryKey(Integer idAssess);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table assess
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Assess record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table assess
     *
     * @mbggenerated
     */
    @Update({
        "update assess",
        "set content = #{content,jdbcType=VARCHAR},",
          "assesser = #{assesser,jdbcType=VARCHAR},",
          "time_assess = #{timeAssess,jdbcType=DATE}",
        "where id_assess = #{idAssess,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Assess record);
}