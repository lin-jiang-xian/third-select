package com.tianshu.spring.web.student.beans;

public class Cat extends Animal {

    public String name;

    public Cat() {
        System.out.println("=============");
    }

    public Cat(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Cat cat = new Cat("你好");
        System.out.println(cat.name);
        cat.setName("hhh");
        System.out.println(cat.getName());
        System.out.println(cat.name);
    }

}
