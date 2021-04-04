package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.domain.Okashi;

//MyBatisでリポジトリを作成する
@Mapper
public interface OkashiMapper {
	//全件取得
	List<Okashi> selectAll();
}
