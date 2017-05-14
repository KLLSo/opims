package me.opims.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by kllso on 17-5-12.
 */
@Controller
@RequestMapping("user/job")
public class JobController {
    @RequestMapping("/list")
    public String test() {
        return "job_list";
    }
}
