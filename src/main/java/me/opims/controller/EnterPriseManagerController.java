package me.opims.controller;

import me.opims.model.Firm;
import me.opims.service.EnterPriseManagerService;
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
public class EnterPriseManagerController {

    private static final Logger logger = LoggerFactory.getLogger(EnterPriseManagerController.class);

    @Resource
    private EnterPriseManagerService enterPriseManagerService;
    @RequestMapping("/addEnterPrise")
    public String addEnterPrise(Firm firm, Model model){
        try {

            model.addAttribute("msg",enterPriseManagerService.addEnterprsie(firm) == 1?"添加成功":"添加失败请认真核对");
            return "";
        }catch (Exception e){
            logger.error(e.getMessage());
            model.addAttribute("msg","增加异常");
            return "";
        }

    }

    @RequestMapping("/getAllFirms")
    public String getAllFirms(@RequestParam(value = "name",defaultValue = "") String name,
                              Model model){

        try {
            model.addAttribute("firms",enterPriseManagerService.getEnterpsriseByName(name));
            return "";

        }catch (Exception e){
            logger.error(e.getMessage());
            model.addAttribute("msg","查询异常");
            return ""; //统一异常处理页
        }
    }

    @RequestMapping("/getFirm")
    public String getFirm(@RequestParam(value = "id") Integer id,
                              Model model){

        try {
            model.addAttribute("firm",enterPriseManagerService.getEnterpriseById(id));
            return "";

        }catch (Exception e){
            logger.error(e.getMessage());
            model.addAttribute("msg","查询异常");
            return ""; //统一异常处理页
        }
    }

    @RequestMapping("/operatorFirm")
    public String operatorFirm(@RequestParam("id") Integer id,
                               @RequestParam(value = "type",defaultValue = "1") int type,Model model){
        try{
            int count = 0;
            switch (type){
                case 1:enterPriseManagerService.FreezeEnterpriseById(id);break;
                case 2:enterPriseManagerService.UnFreezeEnterpriseById(id);break;
            }
            if(count >0){
                model.addAttribute("msg","操作成功");
                return "";
            }else {
                model.addAttribute("msg","操作失败");
                return "";
            }
        }catch (Exception e){
            logger.error(e.getMessage());
            return "";  //统一异常处理
        }
    }
}
