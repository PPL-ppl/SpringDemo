package org.example.AopDemo1;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

//切面 相当于过滤器
@Aspect
@Component
public class LogAspect {
    //定义一个切入点 就是一个方法
    //只要执行有这个注解的方法时 满足切入的要求
    // 先执行注解的，再执行表达式的
    @Pointcut("@annotation(org.example.AopDemo1.Action)")
    public void annotionPointCut() {
    }

    //拦截后做的工作 使用advice的形式
    @After("annotionPointCut()")
    public void afterAdvice(JoinPoint joinPoint) {
        System.out.println("========执行后======");
        System.out.println("执行其他内容");
    }

    @Before("annotionPointCut()")
    public void beforeAdvice1(JoinPoint joinPoint) {
        System.out.println("2");
        Signature signature = joinPoint.getSignature();
        String name = signature.getName();//获取执行的方法名称
        System.out.println("========执行前======");
        int modifiers = signature.getModifiers();
        System.out.println(modifiers);
        System.out.println(name);
        MethodSignature method = (MethodSignature) joinPoint.getSignature();//获取执行的方法名称
        Method method1 = method.getMethod();
        String name1 = method1.getName();
        System.out.println(name1);
        Action annotation = method1.getAnnotation(Action.class);
        System.out.println(annotation.name());//得到注解名
    }

    @Before("execution(* org.example.AopDemo1..*.*(..))") //AopDemo1里的所有方法都被拦截
    public void beforeAdvice3(JoinPoint joinPoint) {
        System.out.println("3");
        Signature signature = joinPoint.getSignature();//获取执行的方法名称
        String name = signature.getName();
        System.out.println("========表达式======");
        int modifiers = signature.getModifiers();
        System.out.println(modifiers);
        System.out.println(name);
        MethodSignature method = (MethodSignature) joinPoint.getSignature();//获取执行的方法名称
        Method method1 = method.getMethod();
        String name1 = method1.getName();
        System.out.println(name1);
        /*Action annotation=method1.getAnnotation(Action.class);
        System.out.println(annotation.name());*///得到注解名
    }

    //环绕建言  优先级第一  可以干预方法执行
    //@Around("execution(* org.example.AopDemo1..*.*(..))") //拦截所有方法
    @Around("execution(* org.example.AopDemo1..*.add2(..))")
    public Object AroundAdvice(ProceedingJoinPoint joinPoint) {
        Object obj = null;
        Object[] args = joinPoint.getArgs();
        for (Object a : args) {
            System.out.println("=============环绕" + a);
        }
        for (int i = 0; i < args.length; i++) {
            args[i] = args[i] + "aop";
        }
        //执行目标方法
        try {
            obj = joinPoint.proceed(args);//执行目标方法 修改了传入参数，需要收到传递进去
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        System.out.println("=============环绕后");
        return obj;
    }


    @AfterReturning("execution(* org.example.AopDemo1..*.*(..))")
    public void afterAdvice2(JoinPoint joinPoint) {
        System.out.println(5);//这个先执行
    }

    @AfterReturning("execution(* org.example.AopDemo1..*.*(..))")
    public void afterReturning(JoinPoint joinPoint) {
        System.out.println(6);
    }

    //方法错误返回
    @AfterThrowing(pointcut = "execution(* org.example.AopDemo1..*.*(..))", throwing = "e")
    public void afterThrowing(Exception e) {
        System.out.println("出错");
        e.printStackTrace();
    }
}
