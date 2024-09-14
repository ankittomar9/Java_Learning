package com.company;

public class cwh_22_ch5_do_while {
    public static void main(String[] args) {
//        int a=0;
//        while(a<5){
//            System.out.println(a);
//            a++;
//        }
        int b=10;
        do{   //execute code first and condition check after
            System.out.println(b);
            b++;
        //    System.out.println(b); // incremented after coming in loop
        }
        while(b<5);

        int c=1;
        do{
            System.out.println(c);
            c++;
        }
        while(c<=100);
    }
}
