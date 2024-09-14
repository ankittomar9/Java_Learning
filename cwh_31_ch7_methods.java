package com.company;

public class cwh_31_ch7_methods {

      static int logic(int x ,int y){
       int z;
        if(x>y){
            z=x+y;
        }
        else{
            z=(x+y)*5;
        }
        return z;
    }

    public static void main(String[] args) {
        int a=5;        int b=7;        int c;
       c=logic(a,b);
        System.out.println(c);
        int a1=3;        int b1=2;            int c1;
        c1=logic(a1,b1);
        System.out.println(c1);

//      Method invocation using Object Creation
//        cwh_31_ch7_methods obj=new cwh_31_ch7_methods();
//       int  c3=obj.logic(a1,b1);
//        System.out.println(c3);
    }
}
