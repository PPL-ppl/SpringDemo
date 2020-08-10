package org.example.Thread;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class AService {
    @Async
    public void methodA(Integer i) {
        System.out.println("执行异步方法" + i);
    }

    @Async
    public void methodB(Integer i) {
        System.out.println("执行异步方法:" + i);
    }

}
