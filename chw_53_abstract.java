package com.company;

abstract class Parent{
    public Parent(){
        System.out.println("Parent  constructor");
    }
    public void sayHello(){
        System.out.println("Hello");
    }
    abstract public void greet();
}

class Child extends Parent{

    @Override
    public void greet() {
        System.out.println("Good Morning ");
    }
}
public class chw_53_abstract {
    public static void main(String[] args) {

       // Parent p = new Parent();
        Child c = new Child();
        c.greet();

    }
}
