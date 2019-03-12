package com.jk.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;

public interface ServiceApi {

    @GetMapping("findList")
    HashMap<String, Object> findList(@RequestParam("page") Integer page, @RequestParam("rows") Integer rows);
}
