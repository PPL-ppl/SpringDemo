package org.example.soundwind.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

//动态代理实现AOP
public class MyInvocationHandler implements InvocationHandler {
    //接受委托对象
    private Object object = null;

    //返回代理对象
    public Object bind(Object object) {
        this.object = object;
        return Proxy.newProxyInstance(object.getClass().getClassLoader(), object.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println(method.getName() + "方法的参数是" + Arrays.toString(args));
        Object invoke = method.invoke(this.object, args);
        System.out.println(method.getName() + "方法的结果是" + invoke);
        return invoke;
    }
}
