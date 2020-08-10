package org.example.DIDemo1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
//@Scope("prototype")//原型 使用后不是同一个对象
// 默认为单例 不配置
//Request web项目中给每个http request创建一个bean实例
//Session web项目中给每个http session创建一个实例
// prototype 每次使用都创建一个对象
public class Bservice {
    @Autowired //依赖注入
            Aservice aservice;

    public String say(String word) {

        return aservice.say(word);
    }
}
