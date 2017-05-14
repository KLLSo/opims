package me.opims.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by kllso on 17-5-12.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:xml/spring.xml")
public class TestDaoJob {
    @Autowired
    private JobDao jobDao;

    @Test
    public void test(){
        System.out.println(jobDao.getTime());

    }

}