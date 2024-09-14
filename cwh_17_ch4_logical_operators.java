package com.company;

public class cwh_17_ch4_logical_operators {
    public static void main(String[] args) {

//        boolean a=true;
//        boolean b=true;
//        boolean c=true;
//        if(a && b && c){
//
//            System.out.println("Yes Satisfied (condition is true)");
//        }
//        else{
//            System.out.println("Not Satisfied (condition is false)");
//        }
//         T  T  =T
//         T  F  =F
//         F  T  =F
//         F  F   = F


        //logical OR

        boolean a=true;
        boolean b=false;

        if(a || b ){

            System.out.println("Yes Satisfied (condition is true)");
        }
        else{
            System.out.println("Not Satisfied (condition is false)");
        }

  //      T  T  =T
//         T  F  =T
//         F  T  =T
//         F  F   = F

        // For Logical not
        System.out.println("Not of A is "); // a is true
        System.out.println(!a);
        System.out.println("Not of B is "); // b is false
        System.out.println(!b);

    }
}
