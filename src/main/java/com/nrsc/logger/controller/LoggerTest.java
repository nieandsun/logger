package com.nrsc.logger.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoggerTest {

    @RequestMapping("/logger")
    public String demo() {

        Logger logger = LoggerFactory.getLogger(LoggerTest.class);

        String username = "yoyo";
        String password = "123456";

        //默认情况下debug日志不会被打印出来，可以参看application-test.yml中的配置，来更改日志级别为debug使其显示
        logger.debug("debug");

        //默认日志级别
        logger.info("info");

        //项目里经常会这样用感觉挺好用的
        logger.error("【用户信息】username={},password={}", username, password);
        return "hello world";
    }


}
