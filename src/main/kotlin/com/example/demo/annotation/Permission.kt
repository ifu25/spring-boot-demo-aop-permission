package com.example.demo.annotation

import java.lang.annotation.Inherited

@Inherited
@Retention(AnnotationRetention.RUNTIME)
@Target(AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY_GETTER, AnnotationTarget.PROPERTY_SETTER)
annotation class Permission(
    /**
     * 加上此注解表示需要有该资源url的才可以访问, 默认值为空，即该url，如果设置了值，则表示有该角色才可以访问
     */
    vararg val value: String = [],
)