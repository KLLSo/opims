package me.opims.dao;

import me.opims.model.Admin;
import me.opims.service.CommentService;
import me.opims.service.UserManager;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;

/**
 * Created by kllso on 17-5-12.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:xml/spring.xml")
public class TestDaoJob {

    @Resource
    private AdminMapper adminMapper;
    @Test
    public void test(){
        System.out.println(adminMapper.selectByNameAdmin("admin"));
    }


    @Resource
    private UserManager userManager;
    @Test
    public void testGetUsers(){
        System.out.println(userManager.getUserByName("").size());
    }

    @Resource
    private JobMapper jobMapper;
    @Test
    public void testGetJob(){
        System.out.println(jobMapper.selectJobsByName("").get(1).getFirm().getNameFirmer());
    }

    @Resource
    private CommentService commentService;

    @Resource
    private CommentMapper commentMapper;
    @Test
    public void testGetComment(){
        System.out.println(commentService.getCommentsByUserName("").get(0).getT().getUser().getNameUser());
    }

    @Test
    public void testGetComent2(){
        System.out.println(commentMapper.selectAllCommentsByContent("").get(0).getContent());
    }


}