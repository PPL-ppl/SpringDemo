package org.example.DIDemo2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration //配置文件
@ComponentScan("org.example.DIDemo2") //需要管理的类的位置 包扫描
public class DiConfig {

    @Bean//让spring执行该方法创建对象
    public Aservice aservice() {
        return new Aservice();
    }

    @Bean
    public Bservice bservice() {
        Bservice bservice = new Bservice();
        bservice.setAservice(aservice());
        return bservice;
    }
}
