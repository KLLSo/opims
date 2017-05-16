package me.opims.controller;

import me.opims.model.Job;
import me.opims.service.JobService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import java.util.Map;

/**
 * Created by tb on 17-5-16.
 */
@Controller
public class JobController {

    private static final Logger logger = LoggerFactory.getLogger(JobController.class);
    @Resource
    private JobService jobService;

    @RequestMapping("/addJob")
    public String addJob(Job job, Model model) {
        try {
            Map<String, Object> map = jobService.addJob(job);
            model.addAttribute("map", map);
            return "";
        } catch (Exception e) {
            logger.error(e.getMessage());
            model.addAttribute("msg", "添加发生异常");
            return "";      //统一页面处理
        }
    }

    @RequestMapping("/deleteJob")
    public String deleteJob(@RequestParam("id") Integer id, Model model) {

        try {
            model.addAttribute("msg", jobService.deletJob(id) > 0 ? "删除成功" : "删除失败");
            return "";
        } catch (Exception e) {
            logger.error(e.getMessage());
            model.addAttribute("msg", "删除发生异常");
            return "";      //统一页面处理
        }
    }

    @RequestMapping("/getJobsByName")
    public String getJobsByName(@RequestParam("name") String name, Model model) {
        try {
            model.addAttribute("jobs", jobService.getJobsByName(name));
            return "";
        } catch (Exception e) {
            logger.error(e.getMessage());
            model.addAttribute("msg", "查询发生异常");
            return "";      //统一页面处理
        }
    }


}
