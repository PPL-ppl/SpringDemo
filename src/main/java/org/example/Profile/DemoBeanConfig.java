package org.example.Profile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@ComponentScan("org.example.Profile")
public class DemoBeanConfig {
    @Bean
    @Profile("dev")
    DemoBean devDemoBean() {
        return new DemoBean("dev环境");
    }

    @Bean
    @Profile("pro")
    DemoBean proDemoBean() {
        return new DemoBean("pro环境");
    }


}
