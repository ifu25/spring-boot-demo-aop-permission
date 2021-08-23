package com.example.demo.aop

import org.aspectj.lang.JoinPoint
import org.aspectj.lang.annotation.Aspect
import org.aspectj.lang.annotation.Before
import org.aspectj.lang.annotation.Pointcut
import org.aspectj.lang.reflect.MethodSignature
import org.springframework.core.annotation.Order
import org.springframework.stereotype.Component

/**
 * 文件说明
 *
 * @author xinggang
 * @create 2021-07-22
 */
@Aspect
@Component //这里有 @Component 则不再需要 AopConfig
@Order(100)
class PermissionAop {

    @Pointcut("@annotation(com.example.demo.annotation.Permission)")
    fun getPermissionPointCut() {
    }

    @Before("getPermissionPointCut()")
    fun doPermission(joinPoint: JoinPoint) {

        // 如果不是超级管理员，则开始进行权限校验
        val methodSignature = joinPoint.signature as MethodSignature
        val method = methodSignature.method
        println(method)
        throw RuntimeException("无权限")
    }
}