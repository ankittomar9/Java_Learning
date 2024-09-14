package com.company;
class Test1{
    int a ;
    public int getA() {
        return a;
    }
    Test1(int v){
       this.a=v;
        //System.out.println();
    }
    public int returnone(){
        return 1;
    }

}

class Test2 extends Test1 {
    Test2(int c){
        super(c);
        System.out.println("Test2 class constructor called");
    }
}

public class cwh_47_this_super {
    public static void main(String[] args) {

        Test1 t=new Test1(45);
        System.out.println(t.getA());
    }
}
