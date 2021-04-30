package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.domain.Okashi;

//MyBatisでリポジトリを作成する
@Mapper
public interface OkashiMapper {

	//1件取得。
    public Okashi findOne(String id);

	//全件取得。メソッド処理内容は、Serviceクラス、SQLはxmlファイルで記載。
	public List<Okashi> selectAll();

	//登録。
	public void insertOne(Okashi o);

	//変更。
    public void updateOne(String id, String name, int kal);



}


