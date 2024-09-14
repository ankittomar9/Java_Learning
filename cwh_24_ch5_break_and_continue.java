package com.company;

import java.sql.SQLOutput;

public class cwh_24_ch5_break_and_continue {
    public static void main(String[] args) {
        //Break and Continue using loops
//        for(int i=1;i<10;i++){
//            System.out.println(i);
//            System.out.println("Running in the loop");
//        if(i==3){
//            System.out.println("condition in ith iteration :  " +i);
//            System.out.println("Break out of the loop");
//            break;
//        }
//        }
//        int j=1;
//        do{
//            System.out.println("Running in the  j loop");
//            if(j==3){
//                System.out.println("condition in j th iteration :  " +j);
//                break;
//            }
//            j++;
//        }
//            while(j<5);
//                System.out.println("Break out of the j  loop");
//        }


        for (int i = 1; i < 10; i++) {
            if (i == 3) {
                System.out.println("ending the loop");
                continue;

            }
            System.out.println(i);
            System.out.println("Java is interesting");
        }
    }
}
