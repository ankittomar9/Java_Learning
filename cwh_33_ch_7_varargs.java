package com.company;

public class cwh_33_ch_7_varargs {
//    static int sum(int a ,int b ,int c,int d){
//        return a+b+c+d;
//    }
//    static int sum(int a ,int b ,int c){
//        return a+b+c;
//    }
//    static int sum(int a ,int b ){
//        return a+b;
//    }

    static int sum (int ...arr){
        //Available as int [] arr;
        int result =0;
        for(int a:arr){
            result=result+a;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("welcome to Varargs tutorial  !!!");
        System.out.println("The sum of a  and  b is : " +sum());
        System.out.println("The sum of a  and  b is : " +sum(4,5));
        System.out.println("The sum of a  and  b  and c is : " +sum(4,3,5));
        System.out.println("The sum of a  and  b  and c  and  d is : " +sum(4,3,5,7));
    }
}
