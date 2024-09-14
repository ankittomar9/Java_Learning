package com.company;
 class Base1{
    int x;
    Base1(){
        System.out.println("I am Base Constructor");
    }
    Base1(int x){
        System.out.println("I am Constructor with a value :  " +x);
    }
 }
 class Derived1 extends Base1 {
     int y;

     Derived1(){
        // super(10);
         System.out.println("I am a Derived class Constructor");
     }
     Derived1(int x,int y){
         super(x);
         System.out.println("I am Constructor with a value of y as :  " +y);
     }
 }

 class childOfDerived extends Derived1{
    childOfDerived(){
         System.out.println("I am constructor of childOfDerived class");
     }
     childOfDerived(int x,int y,int z){
         super(x,y);
         System.out.println("I am constructor of childOfDerived class : " +z);
     }
 }
public class cwh_46_constructors_in_inheritance {
    public static void main(String[] args) {
    //    Base1 b=new Base1();
       // Derived1 d=new Derived1();
      //  Derived1 d=new Derived1( 4, 9);
      //  childOfDerived cd=new childOfDerived();

        childOfDerived cd=new childOfDerived(12,14,16);

    }
}
