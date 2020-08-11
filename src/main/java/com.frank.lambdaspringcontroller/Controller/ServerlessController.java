package com.frank.lambdaspringcontroller.Controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@EnableAutoConfiguration
@Controller
public class ServerlessController {
    @RequestMapping("/serverless")
    @ResponseBody
    public String hello() {
        return "I'm res from serverless";
    }
}
