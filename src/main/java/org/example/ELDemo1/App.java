package org.example.ELDemo1;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AConfig.class);
        AConfig bean = context.getBean(AConfig.class);
        bean.output();
        context.close();
    }
}
