package org.example.AopDemo1;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD}) //注解作用的地方 方法上有用
@Retention(RetentionPolicy.RUNTIME)//运行时有效
public @interface Action {//用来标注哪些方法会被拦截

    String name() default ""; //返回值为空
}
