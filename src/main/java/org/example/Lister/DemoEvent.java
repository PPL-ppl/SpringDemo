package org.example.Lister;

import org.springframework.context.ApplicationEvent;
import org.springframework.stereotype.Service;


public class DemoEvent extends ApplicationEvent {
    //自定义事件

    private String msg;

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public DemoEvent(Object source, String msg) {
        super(source);
        this.msg = msg;
    }
}
