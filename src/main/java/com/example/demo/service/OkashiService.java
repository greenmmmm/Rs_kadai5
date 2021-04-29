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
    
    public List<Okashi> getList() {
        return mapper.selectAll();
    }

}
