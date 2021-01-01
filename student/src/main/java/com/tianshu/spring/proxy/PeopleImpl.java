package com.tianshu.spring.proxy;

public class PeopleImpl implements People {

    @Override
    public void showName() {
        System.out.println("zhangsan");
    }

    @Override
    public void showAge() {
        System.out.println(22);
    }
}
