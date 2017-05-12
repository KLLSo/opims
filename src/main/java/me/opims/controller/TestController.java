package me.opims.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by kllso on 17-5-12.
 */
@Controller
public class TestController {
    @ResponseBody
    @RequestMapping("/test")
    public String test() {
        return "test";
    }
}
