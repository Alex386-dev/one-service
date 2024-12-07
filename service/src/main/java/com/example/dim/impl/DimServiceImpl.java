package com.example.dim.impl;

import com.example.dim.DimDao;
import com.example.dim.DimService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DimServiceImpl implements DimService {
    @Resource
    private DimDao dimDao;
    @Override
    public List<String> listAll() {
        return dimDao.listAll();
    }
}
