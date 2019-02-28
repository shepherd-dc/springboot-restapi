package com.shepherd.demo;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;


/**
 * Created by Administrator on 2019/2/27.
 */
@RestController
@RequestMapping("/list")
public class DemoController {
    private static final Log log = LogFactory.getLog(DemoController.class);

    @GetMapping
    public List<DemoData> getList () {
        if (log.isTraceEnabled()) {
            log.trace("getList()被调用了");
        }
        List<DemoData> list = new ArrayList<>();
        Calendar calendar = Calendar.getInstance();
        calendar.set(2016, Calendar.OCTOBER, 2, 0, 0, 0);
        list.add(new DemoData(1, "West World", 1, calendar.getTime()));
//        calendar.set(2012, Calendar.SEPTEMBER, 22, 0, 0, 0);
//        list.add(new DemoData(2, "Person of Interest", 5, calendar.getTime()));
        System.out.println(list);
        return list;
    }

    /**
     * @Valid 注解表示需要验证传入的参数DemoData，需要验证的field在DemoData内通过注解定义（@NotNull, @DecimalMin等）
     * @param DemoData
     * @return
     */
    @PostMapping
    public DemoData insertOne(@Valid @RequestBody DemoData demoData) {
        if(log.isTraceEnabled()) {
            log.trace("这里应该写新增demoData到数据库的代码, 传递进来的参数是：" + demoData);
        }
        //TODO:在数据
        demoData.setId(9999);
        return demoData;
    }
}
