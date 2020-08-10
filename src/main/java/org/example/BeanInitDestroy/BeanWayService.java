package org.example.BeanInitDestroy;

//@Service
public class BeanWayService {
    public BeanWayService() {
        super();
        System.out.println("BeanWay构造函数执行");
    }

    // @PostConstruct
    public void init() {
        System.out.println("@Bean-init-method");
    }

    // @PreDestroy
    public void destory() {
        System.out.println("@Bean-destory-method");
    }
}
