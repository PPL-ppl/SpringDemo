package org.example.javaboy.Demo1;

import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        //ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
        FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext("D:\\SpringBoot\\DemoT0\\src\\main\\resources\\spring.xml");
        Book book = (Book) context.getBean("book1");
        System.out.println(book);
    }
}
