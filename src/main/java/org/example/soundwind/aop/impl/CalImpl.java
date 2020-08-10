package org.example.soundwind.aop.impl;

import org.example.soundwind.aop.Cal;
import org.springframework.stereotype.Component;

@Component
public class CalImpl implements Cal {
    @Override
    public int add(int a, int b) {
        int add1 = a + b;
        System.out.println(add1);
        return add1;
    }

    @Override
    public void del(int a, int b) {
        int del1 = a - b;
        System.out.println(del1);
    }

    @Override
    public void sum(int a, int b) {
        int sum1 = a * b;
        System.out.println(sum1);
    }
}
