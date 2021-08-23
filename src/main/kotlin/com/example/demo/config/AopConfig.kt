package com.example.demo.config

import com.example.demo.aop.PermissionAop
import org.springframework.context.annotation.Configuration

/**
 * 文件说明
 *
 * @author xinggang
 * @create 2021-07-22
 */
@Configuration
class AopConfig {

    //@Bean
    //PermissionAop 中添加了 @component 注解则这里不再注入，否则会报错：A bean with that name has already been defined in file xxx
    fun permissionAop(): PermissionAop {
        return PermissionAop()
    }
}