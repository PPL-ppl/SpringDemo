package org.example.soundwind.aop;

import org.example.soundwind.aop.impl.CalImpl;

public class Test {
    public static void main(String[] args) {
/*        Cal cal=new CalImpl();
        MyInvocationHandler myInvocationHandler=new MyInvocationHandler();
        Cal cal1=(Cal) myInvocationHandler.bind(cal);
        cal1.add(1,2);*/
        CalImpl cal = new CalImpl();
        cal.add(1, 2);
    }
}
