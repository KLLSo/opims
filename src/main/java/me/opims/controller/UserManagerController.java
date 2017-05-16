package me.opims.controller;

import me.opims.dao.UserMapper;
import me.opims.model.User;
import me.opims.service.UserManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by tb on 17-5-15.
 */
@Controller
public class UserManagerController {

    private static final Logger logger = LoggerFactory.getLogger(UserManagerController.class);

    @Resource
    private UserManager userManager;
    @RequestMapping("/lookUpAllUsers")
    public String  lookUpAllUsers(String name, Model model){
        try{
            List<User> users = userManager.getUserByName(name);
            model.addAttribute("users",users);
        }catch (Exception e){
            logger.info(e.getMessage());
        }
        model.addAttribute("name",name == null ? "":name);
        return "";
    }

    @RequestMapping("/getUserInfo")
    public String getUserInfo(@RequestParam("userId") int userId,Model model){
        try{
            model.addAttribute("user",userManager.getUserById(userId));
            return "";
        }catch (Exception e){
            logger.info(e.getMessage());
            model.addAttribute("msg","获取用户信息异常");
            return "";
        }
    }

    /**
     *
     * @param idUser
     * @param type 1 freeze 2 unfreeze
     * @param model
     * @return
     */
    @RequestMapping("/operateUser")
    public String operateUser(@RequestParam("idUser") Integer idUser,@RequestParam(value = "type",defaultValue = "0") int type,
                              Model model){
        try {
            int count = 0;
            switch (type){
                case 1:count = userManager.FreezeUserById(idUser);break;
                case 2:count = userManager.UnFreezeUserById(idUser);break;
            }
            if(count > 1){
                model.addAttribute("msg","操作成功");
            }else{
                model.addAttribute("msg","操作失败");
            }

        }catch (Exception e){
            logger.info(e.getMessage());
            model.addAttribute("msg","操作异常");
        }
        return "";
    }
}
