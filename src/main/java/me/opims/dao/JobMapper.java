package me.opims.dao;

import me.opims.model.Job;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface JobMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table job
     *
     * @mbggenerated
     */
    @Delete({
        "delete from job",
        "where id_job = #{idJob,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer idJob);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table job
     *
     * @mbggenerated
     */
    @Insert({
        "insert into job (id_job, name_job, ",
        "id_firm, category_job, ",
        "time_job, date, peoples)",
        "values (#{idJob,jdbcType=INTEGER}, #{nameJob,jdbcType=VARCHAR}, ",
        "#{idFirm,jdbcType=INTEGER}, #{categoryJob,jdbcType=VARCHAR}, ",
        "#{timeJob,jdbcType=VARCHAR}, #{date,jdbcType=DATE}, #{peoples,jdbcType=INTEGER})"
    })
    int insert(Job record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table job
     *
     * @mbggenerated
     */
    int insertSelective(Job record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table job
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "id_job, name_job, id_firm, category_job, time_job, date, peoples",
        "from job",
        "where id_job = #{idJob,jdbcType=INTEGER}"
    })
    @ResultMap("BaseResultMap")
    Job selectByPrimaryKey(Integer idJob);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table job
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Job record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table job
     *
     * @mbggenerated
     */
    @Update({
        "update job",
        "set name_job = #{nameJob,jdbcType=VARCHAR},",
          "id_firm = #{idFirm,jdbcType=INTEGER},",
          "category_job = #{categoryJob,jdbcType=VARCHAR},",
          "time_job = #{timeJob,jdbcType=VARCHAR},",
          "date = #{date,jdbcType=DATE},",
          "peoples = #{peoples,jdbcType=INTEGER}",
        "where id_job = #{idJob,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Job record);

    List<Job> selectJobsByName(@Param("name") String name);
}