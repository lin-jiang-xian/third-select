package com.tianshu.spring.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class PeopleProxy{

    public static void main(String[] args) {
        People people = new PeopleImpl();
        People p = (People) Proxy.newProxyInstance(people.getClass().getClassLoader(),
                people.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("你好!");
                        return method.invoke(people,args);
                    }
                });
        p.showName();
        p.showAge();
    }
}