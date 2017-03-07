package com.example;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 注解Demo
 * Created by Deity on 2017/2/8.
 */

@SuppressWarnings("unused")
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface HumanMessageAnnotation {
    /**public Or protect*/
    String userName() default "unknow";
    String getMyBrithday() default "2016-09-10 10:00:00";
    int getMyAge() default 1;
}
