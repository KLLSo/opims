package me.opims.controller;

import me.opims.service.AdminManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * Created by tb on 17-5-15.
 */
@Controller
public class AdminLoginController {

    //记录日志
    private static final Logger logger =  LoggerFactory.getLogger(AdminLoginController.class);

    @Resource
    private AdminManager adminManager;

    /**
     *管理
     * @param nameAdmin
     * @param password
     * @return
     */
    @RequestMapping(value = "/adminLogin",method ={RequestMethod.POST})
    public String adminLogin(@RequestParam("nameAdmin") String nameAdmin,
                             @RequestParam("password")Integer password,Model modelMap,
                             HttpServletRequest request){
        try{
            Map<String,Object> map = adminManager.login(nameAdmin,password);
            if(!map.containsKey("admin")){
                modelMap.addAttribute("msg",map.get("msg"));
                return "login";
            }
            HttpSession session = request.getSession();
            session.setAttribute("admin",map.get("admin"));

            return "redirect:index";
        }catch (Exception e){
            logger.info(e.getMessage());
            modelMap.addAttribute("msg","登录异常");
            return "login";
        }

    }


    @RequestMapping("/index")
    public String index(){
        System.out.println("test");
        return "index_admin";
    }

    @RequestMapping("/logout")
    public String logout(HttpSession session){
        if(session.getAttribute("admin") != null) {
            session.removeAttribute("admin");
        }
        return "redirect:login.jsp";
    }
}
