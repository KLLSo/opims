package me.opims.dao;

import me.opims.model.firm;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface firmMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table firm
     *
     * @mbggenerated
     */
    @Delete({
        "delete from firm",
        "where id_firm = #{idFirm,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer idFirm);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table firm
     *
     * @mbggenerated
     */
    @Insert({
        "insert into firm (id_firm, name_firm, ",
        "name_firmer, mail, ",
        "phone, zhanghao, ",
        "category)",
        "values (#{idFirm,jdbcType=INTEGER}, #{nameFirm,jdbcType=VARCHAR}, ",
        "#{nameFirmer,jdbcType=VARCHAR}, #{mail,jdbcType=VARCHAR}, ",
        "#{phone,jdbcType=INTEGER}, #{zhanghao,jdbcType=VARCHAR}, ",
        "#{category,jdbcType=INTEGER})"
    })
    int insert(firm record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table firm
     *
     * @mbggenerated
     */
    int insertSelective(firm record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table firm
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "id_firm, name_firm, name_firmer, mail, phone, zhanghao, category",
        "from firm",
        "where id_firm = #{idFirm,jdbcType=INTEGER}"
    })
    @ResultMap("BaseResultMap")
    firm selectByPrimaryKey(Integer idFirm);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table firm
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(firm record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table firm
     *
     * @mbggenerated
     */
    @Update({
        "update firm",
        "set name_firm = #{nameFirm,jdbcType=VARCHAR},",
          "name_firmer = #{nameFirmer,jdbcType=VARCHAR},",
          "mail = #{mail,jdbcType=VARCHAR},",
          "phone = #{phone,jdbcType=INTEGER},",
          "zhanghao = #{zhanghao,jdbcType=VARCHAR},",
          "category = #{category,jdbcType=INTEGER}",
        "where id_firm = #{idFirm,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(firm record);
}