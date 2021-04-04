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

	//サーバーが受け付ける"URL"と"処理"を関連付ける(Mappingする)
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(Model model) {

    	//リストに、マッパークラスで取得したDBのデータを入れる
    	List<Okashi> list = okashiMapper.selectAll();

    	//addAttribute(キー名, 値);キー名を指定すると,画面が値を受け取ることができます。listの値を"okashi"という要素に入れる。
    	model.addAttribute("okashi", list);

        return "index";
    }
}