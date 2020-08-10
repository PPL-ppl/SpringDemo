package org.example.Scheduled;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

@Configuration
@ComponentScan("org.example.Scheduled")
@EnableScheduling
public class ScheduledConfig {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ScheduledConfig.class);
        ScheduledTaskService bean = context.getBean(ScheduledTaskService.class);
        //bean.reportCurrentTime();
        //bean.FixTimeExctution();
    }
}
