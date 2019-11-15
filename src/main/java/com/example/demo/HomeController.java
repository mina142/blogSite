package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String index(){

        return "index";
    }

    @GetMapping("/index2")
    public String index2(){

        return "index2";
    }

    @GetMapping("/index3")
    public String index3(){

        return "index3";
    }

    @GetMapping("/index4")
    public String index4(){

        return "index4";
    }
    @GetMapping("/contact")
    public String contact(){

        return "Contact";
    }
    @GetMapping("/aboutus")
    public String aboutUs(){

        return "AboutUS";
    }
}
