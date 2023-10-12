package com.example.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author qzing
 * @ClassName: IndexController
 * @projectName: springboot-admin-demo
 * @description: TODO
 * @date 2023/10/12 14:57
 */
@RestController
@Slf4j
public class IndexController {
    @GetMapping("/index")
    private String index(){
        String msg = "hello index...";
        log.info(msg);
        return msg;
    }
}
