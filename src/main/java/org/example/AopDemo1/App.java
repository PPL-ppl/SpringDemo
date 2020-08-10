package org.example.AopDemo1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        System.out.println("hello");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AopConfig.class);
        Aservice bean = context.getBean(Aservice.class);
        String heihei = bean.add("heihei");
        String heihei2 = bean.add2("heihei");
        System.out.println("main:" + heihei);
        System.out.println("main" + heihei2);
        context.close();
    }
}
