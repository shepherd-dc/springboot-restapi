package com.shepherd.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;


/**
 * Created by Administrator on 2019/2/27.
 */
@RestController
@RequestMapping("/list")
public class DemoController {
    @GetMapping
    public List<DemoData> getList () {
        List<DemoData> list = new ArrayList<>();
        Calendar calendar = Calendar.getInstance();
        calendar.set(2016, Calendar.OCTOBER, 2, 0, 0, 0);
        list.add(new DemoData(1, "West World", 1, calendar.getTime()));
        System.out.println(list);
        return list;
    }
}
