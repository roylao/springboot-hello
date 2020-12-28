package com.roylao.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @desc hello controller
 * @author roylao
 * @createTime 2020-3-22 18:20:06
 */
@RestController
@Slf4j
public class HelloController {

    @GetMapping("/")
    public String main(){
        log.info("Hello this is SpringBoot");
        return "Hello this is SpringBoot";
    }
}
