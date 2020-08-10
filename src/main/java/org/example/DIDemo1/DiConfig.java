package org.example.DIDemo1;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration //配置文件
@ComponentScan("org.example.DIDemo1") //需要管理的类的位置 包扫描
public class DiConfig {
}
