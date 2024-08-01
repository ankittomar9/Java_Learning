package com.company;

import java.util.Scanner;

public class cbse_board_sol {
    public static void main(String[] args) {
        System.out.println("Taking input from user");
        //Read data from keyboard

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter total ");
        float total = scn.nextFloat();

        System.out.println("Enter subject 1");
        float a1 = scn.nextFloat();
       System.out.println("Enter subject 2");
        float b1 = scn.nextFloat();

        System.out.println("Enter subject 3");
        float c1 = scn.nextFloat();
        System.out.println("Enter subject 4");
        float d1 = scn.nextFloat();

        System.out.println("Enter subject 5");
        float e1 = scn.nextFloat();




        float  total_marks_obtained = a1 + b1+c1+d1+e1;
        System.out.println("total_marks_obtained : " + total_marks_obtained);

        double percentage= (total_marks_obtained/(5*total))*100;



        System.out.println("The percentage of student is : " +percentage);

    }
    }
