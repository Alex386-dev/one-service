package com.example.dim;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/dim")
public class DimController {
    @Resource
    DimService dimService;

    @GetMapping("listAll")
    public List<String> listAll(){
        return dimService.listAll();
    }
}
