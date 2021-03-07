package com.example.demo.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller//下記クラスは、コントローラとして機能します
public class HelloController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(Model model) {
    	model.addAttribute("message", "Hello World!!");
        return "index";
    }
}