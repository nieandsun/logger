package com.nrsc.logger.controller;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class LoggerTest2 {

    @RequestMapping("/logger2")
    public String demo() {
        //使用lombok的@Slf4j注解，下面这句话就不需要了，默认生成了一个Logger实例，名字为log
        // Logger logger = LoggerFactory.getLogger(LoggerTest2.class);

        String username = "yoyo";
        String password = "123456";

        //可以直接使用log打日志
        log.debug("debug");

        //默认日志级别
        log.info("info");

        //项目里经常会这样用感觉挺好用的
        log.error("【用户信息】username={},password={}", username, password);
        return "hello world";
    }


}
