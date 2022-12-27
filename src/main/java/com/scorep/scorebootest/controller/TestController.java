package com.scorep.scorebootest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

    @RequestMapping(value={"", "/", "hit"})
    public String testScore(){
        return "score.html";
    }
}
