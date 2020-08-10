package org.example.Lister;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoEventConfig.class);

        DemoEventPublisher bean = context.getBean(DemoEventPublisher.class);
        bean.publisher("这是一个事件消息");

    }
}
