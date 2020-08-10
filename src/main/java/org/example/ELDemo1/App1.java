package org.example.ELDemo1;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AConfig1.class);
        AConfig1 bean = context.getBean(AConfig1.class);
        bean.output();
        context.close();
    }
}
