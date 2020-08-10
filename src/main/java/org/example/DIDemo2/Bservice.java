package org.example.DIDemo2;

//@Service
//@Scope("prototype")//原型 使用后不是同一个对象
public class Bservice {
    //@Autowired //依赖注入
    Aservice aservice;

    public void setAservice(Aservice aservice) {
        this.aservice = aservice;
    }

    public String say(String word) {

        return aservice.say(word);
    }
}
