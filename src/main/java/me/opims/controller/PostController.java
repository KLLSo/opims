package me.opims.controller;

import me.opims.model.Post;
import me.opims.service.PostService;
import org.apache.ibatis.annotations.Param;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;

/**
 * Created by tb on 17-5-16.
 */
@Controller
public class PostController {

    private static final Logger logger = LoggerFactory.getLogger(PostController.class);
    @Resource
    private PostService postService;

    @RequestMapping("/getAllPost")
    public String getAllPost(String name, Model model){
        try {
            model.addAttribute("posts",postService.getPostByContent(name));
            return "";
        }catch (Exception e){
            logger.error(e.getMessage());
            model.addAttribute("msg","查询异常");
            return "";
        }
    }

    @RequestMapping("/getPost")
    public String getPost(@Param("id") Integer id, Model model){
        try {
            model.addAttribute("posts",postService.getPost(id));
            return "";
        }catch (Exception e){
            logger.error(e.getMessage());
            model.addAttribute("msg","查询异常");
            return "";
        }
    }


    @RequestMapping("/updatePost")
    public String updatePost(Post post, Model model){
        try {
            int count = 0;
            model.addAttribute("msg",(count = postService.updatePost(post)) >0 ?"更新成功":"更新失败" );
            //根据count 跳转
            return "";
        }catch (Exception e){
            logger.error(e.getMessage());
            model.addAttribute("msg","更新异常");
            return "";
        }
    }


    @RequestMapping("/addPost")
    public String addPost(Post post, Model model){
        try {
            int count = 0;
            model.addAttribute("msg",(count = postService.addPost(post)) >0 ?"添加成功":"添加失败" );
            //根据count 跳转
            return "";
        }catch (Exception e){
            logger.error(e.getMessage());
            model.addAttribute("msg","添加异常");
            return "";
        }
    }

    @RequestMapping("/deletePost")
    public String deletePost(@RequestParam("id") Integer id, Model model){
        try {
            int count = 0;
            model.addAttribute("msg",(count = postService.deletePost(id)) >0 ?"删除成功":"删除失败" );
            //根据count 跳转
            return "";
        }catch (Exception e){
            logger.error(e.getMessage());
            model.addAttribute("msg","删除异常");
            return "";
        }
    }


}
