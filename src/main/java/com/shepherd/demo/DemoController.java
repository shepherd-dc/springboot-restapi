package com.shepherd.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2019/2/27.
 */
@RestController
@RequestMapping("/hello")
public class DemoController {
    @GetMapping
    public Map<String, Object> hello () {
        Map<String, Object> result = new HashMap<>();
        result.put("message", "Hello world!");
        System.out.println(result);
        return result;
    }
}
