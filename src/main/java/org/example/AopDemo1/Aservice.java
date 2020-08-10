package org.example.AopDemo1;

import org.springframework.stereotype.Service;

@Service
public class Aservice {
    @Action(name = "拦截的方法")
    public String add(String word) {
        System.out.println("开始进入Aservic的add方法");
        return "A" + word;
    }

    //@Action(name = "拦截的方法")
    public String add2(String word) {
        System.out.println("开始进入Aservic的add方法");
        return "B" + word;
    }
}
