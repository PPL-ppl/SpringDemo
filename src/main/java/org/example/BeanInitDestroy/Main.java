package org.example.BeanInitDestroy;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
        BeanWayService bean = context.getBean(BeanWayService.class);
        System.out.println(bean);
        context.close();
    }
}
