package org.example.ELDemo1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("org.example.ELDemo1")
@PropertySource(value = {"classpath:org/example/ELDemo1/text.properties", "classpath:org/example/ELDemo1/text.yml"}
        , factory = MixDefaultPropertySourceFactory.class)//自己的工厂类 需要jar包支持  另一种解决方案 添加springboot的configuration jar包
//文件路径
public class AConfig1 {
    @Value("i love spring boot")
    private String normal;
    @Value("#{AService.another}")//获得了AService的another的属性  获得其他类的属性
    private String fromAnother;
    @Value("${book.name}")//${} 取值占位符
    private String bookName;//注入text.properties
    @Value("${app.name}")
    private String bookName2;

    public void output() {
        try {
            System.out.println(normal);
            System.out.println(fromAnother);
            System.out.println(bookName);
            System.out.println(bookName2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
