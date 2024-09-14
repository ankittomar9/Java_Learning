package com.company;

class Base{
    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println("Setting the x value now in Base class ");
        this.x = x;
    }
}

class Derived extends Base{
int y ;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        System.out.println("Setting the Y value now");
        this.y = y;
    }
    public void printFunc(){
        System.out.println("print Constructor");
    }


}

public class cwh_inheritance {
    public static void main(String[] args) {
        Base b=new Base();
        b.setX(4);
        System.out.println(b.getX());

        Derived d=new Derived();
        d.setX(456);
        System.out.println(d.getX());

        Derived d2=new Derived();
        d.setY(254);
        System.out.println(d.getY());



    }
}
