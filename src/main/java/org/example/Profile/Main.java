package org.example.Profile;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        //设置当前环境
        //context.getEnvironment().setActiveProfiles("dev");
        context.getEnvironment().setActiveProfiles("pro");
        context.register(DemoBeanConfig.class);//注册配置环境
        context.refresh();//必须有

        DemoBean bean = context.getBean(DemoBean.class);
        System.out.println(bean.getNumber());
    }
}
