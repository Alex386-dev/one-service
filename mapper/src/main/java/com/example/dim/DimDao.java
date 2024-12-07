package com.example.dim;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DimDao {
    List<String> listAll();
}
