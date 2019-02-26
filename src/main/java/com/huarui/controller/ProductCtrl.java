package com.huarui.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by lihui on 2019/2/25.
 */
@RestController
@RequestMapping("/product")
public class ProductCtrl {

    @GetMapping("/getMsg")
    public Map<String, String> getMsg(){
        Map<String,String> map = new HashMap<>();
        map.put("state","200");
        map.put("data","ok");
        map.put("msg","数据返回成功");
        return map;
    }

}
