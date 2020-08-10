package org.example.DIDemo2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        //初始化spring
        System.out.println("hello word");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DiConfig.class);
        /*Aservice bean = context.getBean(Aservice.class);
        System.out.println(bean.say("hello1"));*/
        //Bservice bean1 = context.getBean(Bservice.class);
        Bservice bean1 = (Bservice) context.getBean("bservice");
        Bservice bean2 = context.getBean(Bservice.class);
        System.out.println(bean1.say("hello2"));
        System.out.println(bean1 == bean2);
    }
}
