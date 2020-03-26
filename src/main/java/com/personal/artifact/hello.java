package com.personal.artifact;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class hello {

    @GetMapping("/home")
    public String welcome() {
        return "home";
    }

}
