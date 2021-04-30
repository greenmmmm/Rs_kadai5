package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.domain.Okashi;
import com.example.demo.mapper.OkashiMapper;
import com.example.demo.service.OkashiService;

@Controller//下記クラスは、コントローラとして機能します
public class HelloController {

	@Autowired
	OkashiMapper okashiMapper;
    @Autowired
    OkashiService service;

	//サーバーが受け付ける"URL"と"処理"を関連付ける(Mappingする)
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(Model model) {

    	//リストに、マッパークラスで取得したDBのデータを入れる
    	List<Okashi> list = service.getList();

    	//addAttribute(キー名, 値);キー名を指定すると,画面が値を受け取ることができます。listの値を"okashi"という要素に入れる。
    	model.addAttribute("okashi", list);

        return "index";
    }

    //登録ボタンを押すと、登録画面に移動
    @GetMapping("/register")
    public String registerUser(Model model, @ModelAttribute Okashi o) {
        model.addAttribute("okashi", o);
        return "register";
    }
    //新規作成ボタンを押すと、登録してトップページに戻る
    @PostMapping("/register")
    public String create(@ModelAttribute Okashi o) {
        service.insertOne(o);
        return "redirect:/";
    }

    //変更ボタンを押すと、変更画面に移動
    @GetMapping("change/id={id}")
    public String change(@PathVariable("id") String id, Model model) {
        model.addAttribute("okashi", service.getOne(id));
        return "change";
    }
}