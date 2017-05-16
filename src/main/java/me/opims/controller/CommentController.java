package me.opims.controller;

import me.opims.service.CommentService;
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
public class CommentController {
    private static final Logger logger = LoggerFactory.getLogger(CommentController.class);

    @Resource
    private CommentService commentService;

    @RequestMapping("/getAllCommentsByContent")
    public String getAllCommentsByContent(@Param("content") String content, Model model) {
        try {
            model.addAttribute("contents", commentService.getCommentsByContent(content));
            return "";
        } catch (Exception e) {
            logger.error(e.getMessage());
            model.addAttribute("msg", "查询异常");
            return "";
        }

    }


    @RequestMapping("/getAllCommentsByUserName")
    public String getAllCommentsByUserName(@Param("userName") String userName, Model model) {
        try {
            model.addAttribute("contents", commentService.getCommentsByUserName(userName));
            return "";
        } catch (Exception e) {
            logger.error(e.getMessage());
            model.addAttribute("msg", "查询异常");
            return "";
        }

    }

    @RequestMapping("/deleteComment")
    public String deleteComment(@RequestParam("id") Integer id,Model model){
        try {
            int count = 0;
            model.addAttribute("msg", (count =commentService.deleteComment(id)) > 0 ?"删除成功":"删除失败");
            //根据count 跳转
            return "";

        } catch (Exception e) {
            logger.error(e.getMessage());
            model.addAttribute("msg", "删除异常");
            return "";
        }

    }
}