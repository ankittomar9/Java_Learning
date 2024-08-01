package com.company;
import java.util.*;


public class cwh_05_input_read {
    public static void main(String[] args) {
        System.out.println("Taking input from user");
        //Read data from keyboard
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter number 1");

        int a =scn.nextInt();
        float a1 =scn.nextFloat();
        System.out.println("Enter number 2");

        int b =scn.nextInt();
        float b1 =scn.nextFloat();

        int sum=a+b;
        double sum1=a1+b1;

        System.out.println("The sum of a and b is : " +sum);
        System.out.println("The sum of a and b is : " +sum1);


    }
}
