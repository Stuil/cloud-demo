package com.productdemo.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @title: SellarAop
 * @description: Aop
 * @date: 2019/12/26
 * @author: Stuil
 * @copyright: Copyright (c) 2019
 * @version:
 */

/**
 * @description:  @Aspect:作用是把当前类标识为一个切面供容器读取
 *
 *   @Pointcut：Pointcut是植入Advice的触发条件。每个Pointcut的定义包括2部分，一是表达式，二是方法签名。方法签名必须是
 *     public及void型。可以将Pointcut中的方法看作是一个被Advice引用的助记符，因为表达式不直观，因此我们可以通过方法签名的方式为 此表达式命名。
 *     因此Pointcut中的方法只需要方法签名，而不需要在方法体内编写实际代码。
 *
 *   @Around：环绕增强，相当于MethodInterceptor
 *   @AfterReturning：后置增强，相当于AfterReturningAdvice，方法正常退出时执行
 *   @Before：标识一个前置增强方法，相当于BeforeAdvice的功能，相似功能的还有
 *   @AfterThrowing：异常抛出增强，相当于ThrowsAdvice
 *   @After: final增强，不管是抛出异常或者正常退出都会执行

 */
@Aspect
@Component
public class SellarAop {
   /* @Pointcut("execution(public * com.productdemo.controller.app.*.*(..))")
    public void verify() {

    }*/

    @Pointcut(value = "@annotation(com.productdemo.aop.ConAop)")
    public void verify() {

    }

/*    @Before("verify()")
    public String doVerify() throws Exception {
        ServletRequestAttributes attributes=(ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletResponse response=attributes.getResponse();
        HttpServletRequest request=attributes.getRequest();
        System.out.println(request.getParameter("name"));

        if(!request.getParameter("name").equals("1")){
            *//*response.setContentType("application/json; charset=UTF-8");
            response.getWriter().print("11111111111111111111");*//*
            return "2222222222";
        }
        return "111111";
    }*/

    @Around("verify()")
    public Object doVerify(ProceedingJoinPoint pjp) throws Throwable {
        ServletRequestAttributes attributes=(ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletResponse response=attributes.getResponse();
        HttpServletRequest request=attributes.getRequest();
        System.out.println(request.getParameter("name"));

        if(!request.getParameter("name").equals("1")){

            return "11111";
        }
        return pjp.proceed();
    }

}
