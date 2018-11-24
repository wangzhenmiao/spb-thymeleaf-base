package com.wangzhen.spbthymeleafbase.miao.controller;

/**
 * @ClassName IndexController
 * @Description
 * @Author wangzhen
 * @Date 2018/11/24 下午4:14
 **/
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping("/")
    public String index(){
        System.out.println("IndexController index方法被调用......");
        return "index";
    }

}
