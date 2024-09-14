package com.company;

import java.util.Scanner;

public class cwh_18_switch_elseIf {
    public static void main(String[] args) {
        String var ="Ankit";

        switch(var){
            case "Aman" -> {
                System.out.println("Aman is working  professional ");
                System.out.println("Aman is working  professional 1 ");
                System.out.println("Aman is working  professional 2");
                System.out.println("Aman is working  professional 3");
            }
            case "Ankur" -> System.out.println("You got  a job");
            case "Ankit" -> System.out.println("You are trying to get a job");
            case  "Leo" ->System.out.println("leo is new cat");
            default -> System.out.println("Learning programming");

        }


        //int age=56;
//        System.out.println("Enter age to check ");
//        Scanner scn=new Scanner(System.in);
////        int age;
//         age=scn.nextInt();
//        switch(age){
//            case 18:
//                System.out.println("You are going to become adult");
//                break;
//
//        case 23:
//        System.out.println("You are going to get a job");
//        break;
//        case 60:
//        System.out.println("you are retired");
//        break;
//        default:
//        System.out.println("enjoy life");
//}
 //       System.out.println("Learning Java through course");
//
//        // ladder if else  if elseif elseif else
//        if(age>56){
//            System.out.println("You are very experienced");
//        }
//        else if(age>46) {
//            System.out.println("You are semi experienced");
//        }
//        else  if(age>36){
//            System.out.println("You are semi -semi  experienced");
//        }
//        else{
//            System.out.println("You are learning Spend more time on learning");
//        }
//


    }
}
