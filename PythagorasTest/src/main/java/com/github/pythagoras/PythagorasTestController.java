package com.github.pythagoras;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PythagorasTestController {

    @RequestMapping("/welcome")
    public String welcome() {
        return ("welcome");
    }
}