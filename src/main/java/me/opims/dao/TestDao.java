package me.opims.dao;

import org.apache.ibatis.annotations.Mapper;

/**
 * Created by kllso on 17-5-12.
 */
@Mapper
public interface TestDao {
    String getTime();
}
