package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.domain.Okashi;

@Mapper
public interface OkashiMapper {
	List<Okashi> selectAll();
}
