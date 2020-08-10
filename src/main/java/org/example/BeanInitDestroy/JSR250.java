package org.example.BeanInitDestroy;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class JSR250 {

    public JSR250() {
        super();
        System.out.println("jsr250");
    }

    @PostConstruct
    public void init() {
        System.out.println("jsr250初始化");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("jsr250销毁");
    }
}
