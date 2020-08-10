package org.example.Aware;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.InputStream;

@Service
public class AwareService implements BeanNameAware, ResourceLoaderAware {
    private String name;//存放当前bean的名称
    private ResourceLoader resourceLoader;//加载资源的工具

    public void setName(String name) { //自动注入调用该方法 使用时要有set方法
        System.out.println("自动注入");
        this.name = name;
    }

    public void setResourceLoader(ResourceLoader resourceLoader) {//自动注入调用该方法
        System.out.println("spring 注入");
        this.resourceLoader = resourceLoader;
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("spring 注入");
        this.name = s;
    }

    public void outputResult() {
        System.out.println("bean name:" + this.name);
        try {
            InputStream inputStream = resourceLoader.getResource("classpath:org/example/Aware/Text.txt").getInputStream();
            String s = IOUtils.toString(inputStream, "UTF-8");
            System.out.println(s);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
