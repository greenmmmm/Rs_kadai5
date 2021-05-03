package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.Okashi;
import com.example.demo.mapper.OkashiMapper;

@Service
public class OkashiService {

    @Autowired
    OkashiMapper mapper;

    //全件取得
    public List<Okashi> getList() {
        return mapper.selectAll();
    }

    //1件取得
    public Okashi getOne(String id) {
        return mapper.findOne(id);
    }

    //登録
    public void insertOne(Okashi o) {
        mapper.insertOne(o);
    }

    //変更
    public void updateOne(String id, String name, int kal) {
        mapper.updateOne(id, name, kal);
    }

    //削除
    public void deleteOne(Okashi o) {
        mapper.deleteOne(o);
    }

}
