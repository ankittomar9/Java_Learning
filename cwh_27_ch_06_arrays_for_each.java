package com.company;

public class cwh_27_ch_06_arrays_for_each {
    public static void main(String[] args) {
        int[] marks  ={98,45,79,99,80,55,66,77,88,11};
        float[] marks1  ={98.5f,45.5f,79.5f,99.7f,80.1f,55.5f,66.4f,77.8f,88.3f,11.9f};
        String [] stud={"harry","aman","Shubham","naman"};
        System.out.println(marks.length);
        System.out.println(marks1[6]);
        System.out.println(stud[2]);



        int[] marks2  ={98,45,79,99,80,55,66};

        //Displaying Naive way array by index individual
        System.out.println(marks2[0]);
        System.out.println(marks2[1]);
        System.out.println(marks2[2]);
        System.out.println(marks2[3]);
        System.out.println(marks2[4]);

  // displaying array  using for loop
        for(int i=0;i<marks2.length;i++){
            System.out.print( " " +marks2[i]);

        }
        System.out.println( " ---------------------------------------");

        // displaying array  using for loop reverse
        System.out.println( " displaying array  using for loop reverse ");
        for(int i=marks2.length -1 ;i>=0;i--){
            System.out.print( "  " +marks2[i]);
        }
        System.out.println( " ---------------------------------------");


        // displaying array  using for each loop
        System.out.println( "  displaying array  using for each loop ");
        for(int element : marks2){
            System.out.print(" " +element);
        }


    }
}
