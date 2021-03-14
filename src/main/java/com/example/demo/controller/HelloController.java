package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.domain.Okashi;
import com.example.demo.mapper.OkashiMapper;

@Controller//下記クラスは、コントローラとして機能します
public class HelloController {

	@Autowired
	OkashiMapper okashiMapper;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(Model model) {
    	List<Okashi> list = okashiMapper.selectAll();
    	model.addAttribute("okashi", list);
        return "index";
    }
}