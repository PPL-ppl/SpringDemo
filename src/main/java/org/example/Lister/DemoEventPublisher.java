package org.example.Lister;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class DemoEventPublisher {
    //消息的发布者
    @Autowired
    ApplicationContext context;

    public void publisher(String msg) {
        context.publishEvent(new DemoEvent(this, msg));
    }
}
