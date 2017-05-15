package me.opims.dao;

import me.opims.model.post;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface postMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table post
     *
     * @mbggenerated
     */
    @Delete({
        "delete from post",
        "where id_post = #{idPost,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer idPost);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table post
     *
     * @mbggenerated
     */
    @Insert({
        "insert into post (id_post, bt_post, ",
        "xq_post, date_fb, date_sx)",
        "values (#{idPost,jdbcType=INTEGER}, #{btPost,jdbcType=VARCHAR}, ",
        "#{xqPost,jdbcType=VARCHAR}, #{dateFb,jdbcType=DATE}, #{dateSx,jdbcType=DATE})"
    })
    int insert(post record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table post
     *
     * @mbggenerated
     */
    int insertSelective(post record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table post
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "id_post, bt_post, xq_post, date_fb, date_sx",
        "from post",
        "where id_post = #{idPost,jdbcType=INTEGER}"
    })
    @ResultMap("BaseResultMap")
    post selectByPrimaryKey(Integer idPost);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table post
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(post record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table post
     *
     * @mbggenerated
     */
    @Update({
        "update post",
        "set bt_post = #{btPost,jdbcType=VARCHAR},",
          "xq_post = #{xqPost,jdbcType=VARCHAR},",
          "date_fb = #{dateFb,jdbcType=DATE},",
          "date_sx = #{dateSx,jdbcType=DATE}",
        "where id_post = #{idPost,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(post record);
}