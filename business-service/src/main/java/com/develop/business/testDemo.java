package com.develop.business;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试类
 *
 * @author 周成成
 * @create 2017-11-09 11:20
 * To change this template use File | Settings | Editor | File and Code Templates.
 **/
@RestController
public class testDemo {

    @RequestMapping("demo")
    public String test() {
        return "this is a testDemo";
    }
}
