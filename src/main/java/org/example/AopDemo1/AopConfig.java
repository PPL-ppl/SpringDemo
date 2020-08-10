package org.example.AopDemo1;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("org.example.AopDemo1")
@EnableAspectJAutoProxy//支持AOP
public class AopConfig {
}
