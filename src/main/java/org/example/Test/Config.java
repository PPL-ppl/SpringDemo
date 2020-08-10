package org.example.Test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class Config {

    @Bean
    @Profile("dev")
    AService AService() {
        return new AService("dev开发");
    }

    @Bean
    @Profile("pro")
    AService BService() {
        return new AService("pro开发");
    }
}
