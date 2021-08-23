package com.example.demo.web

import com.example.demo.annotation.Permission
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

/**
 * 文件说明
 *
 * @author xinggang
 * @create 2021-07-22
 */
@RestController
class HomeController {

    @Permission
    @GetMapping("/")
    fun index(): String {
        return "hello"
    }
}