package org.example.ELDemo1;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;


@Configuration
@ComponentScan("org.example.ELDemo1")
@PropertySource("classpath:org/example/ELDemo1/text.properties")//文件路径
public class AConfig {
    @Value("i love spring boot")
    private String normal;
    @Value("#{AService.another}")//获得了AService的another的属性  获得其他类的属性
    private String fromAnother;
    @Value("${book.name}")//${} 取值占位符
    private String bookName;//注入text.properties
    @Autowired
    Environment environment;
    //#需要运算的  $占位符
    @Value("#{systemProperties['os.name']}") //window10
    private String osName;

    @Value("#{T(java.lang.Math).random()*100.0}") //计算的值
    private double randomNumber;

    //注入文件内容 或者 网络地址获得的内容

    @Value("classpath:org/example/ELDemo1/text")
    private Resource textFile;
    @Value("http://www.alibaba.com")
    private Resource textUrl;

    public void output() {
        try {
            System.out.println(normal);
            System.out.println(fromAnother);
            System.out.println(bookName);
            System.out.println(environment.getProperty("book.name"));
            System.out.println(osName);
            System.out.println(randomNumber);
            System.out.println(IOUtils.toString(textFile.getInputStream(), "UTF-8"));
            System.out.println(IOUtils.toString(textUrl.getInputStream(), "UTF-8"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
