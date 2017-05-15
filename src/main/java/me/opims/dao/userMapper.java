package me.opims.dao;

import me.opims.model.user;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface userMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated
     */
    @Delete({
        "delete from user",
        "where id_user = #{idUser,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer idUser);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated
     */
    @Insert({
        "insert into user (id_user, name_user, ",
        "name_real, mail, ",
        "phone, zhanghao, ",
        "category)",
        "values (#{idUser,jdbcType=INTEGER}, #{nameUser,jdbcType=VARCHAR}, ",
        "#{nameReal,jdbcType=VARCHAR}, #{mail,jdbcType=VARCHAR}, ",
        "#{phone,jdbcType=INTEGER}, #{zhanghao,jdbcType=VARCHAR}, ",
        "#{category,jdbcType=INTEGER})"
    })
    int insert(user record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated
     */
    int insertSelective(user record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "id_user, name_user, name_real, mail, phone, zhanghao, category",
        "from user",
        "where id_user = #{idUser,jdbcType=INTEGER}"
    })
    @ResultMap("BaseResultMap")
    user selectByPrimaryKey(Integer idUser);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(user record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated
     */
    @Update({
        "update user",
        "set name_user = #{nameUser,jdbcType=VARCHAR},",
          "name_real = #{nameReal,jdbcType=VARCHAR},",
          "mail = #{mail,jdbcType=VARCHAR},",
          "phone = #{phone,jdbcType=INTEGER},",
          "zhanghao = #{zhanghao,jdbcType=VARCHAR},",
          "category = #{category,jdbcType=INTEGER}",
        "where id_user = #{idUser,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(user record);
}