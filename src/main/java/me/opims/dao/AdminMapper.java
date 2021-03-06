package me.opims.dao;

import me.opims.model.Admin;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface AdminMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin
     *
     * @mbggenerated
     */
    @Delete({
        "delete from admin",
        "where id_admin = #{idAdmin,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer idAdmin);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin
     *
     * @mbggenerated
     */
    @Insert({
        "insert into admin (id_admin, name_admin, ",
        "phone, zhanghao, ",
        "category)",
        "values (#{idAdmin,jdbcType=INTEGER}, #{nameAdmin,jdbcType=VARCHAR}, ",
        "#{phone,jdbcType=INTEGER}, #{zhanghao,jdbcType=VARCHAR}, ",
        "#{category,jdbcType=INTEGER})"
    })
    int insert(Admin record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin
     *
     * @mbggenerated
     */
    int insertSelective(Admin record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "id_admin, name_admin, phone, zhanghao, category",
        "from admin",
        "where id_admin = #{idAdmin,jdbcType=INTEGER}"
    })
    @ResultMap("BaseResultMap")
    Admin selectByPrimaryKey(Integer idAdmin);

    @Select({
            "select",
            "id_admin, name_admin, phone, zhanghao, category",
            "from admin",
            "where name_admin like #{nameAdmin}"
    })
    @ResultMap("BaseResultMap")
    Admin selectByNameAdmin(String nameAdmin);
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Admin record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin
     *
     * @mbggenerated
     */
    @Update({
        "update admin",
        "set name_admin = #{nameAdmin,jdbcType=VARCHAR},",
          "phone = #{phone,jdbcType=INTEGER},",
          "zhanghao = #{zhanghao,jdbcType=VARCHAR},",
          "category = #{category,jdbcType=INTEGER}",
        "where id_admin = #{idAdmin,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Admin record);
}