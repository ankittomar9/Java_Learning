package com.company;

public class cwh_25_ch5_practice_set_Loops {
    public static void main(String[] args) {
        //Question 1
        /* Print below pattern using loops

        ****
        ***
        **
        *

        */
//        int n=4;
//        for(int i=n;i>0;i--){
//            for(int j=0;j<i;j++) {
//                System.out.print("*");
//            }
//              System.out.println("\n");
//        }

        //Question find sum of even numbers using while loop
//        int n=4; int sum=0;
//       for(int i=0;i<n;i++){
//           sum=sum+(2*i);
//       }
//        System.out.println("Sum of Even number is " + sum);
//         //First 4 even numbers 0 2 4 6

 // Question 3: Write a program to print the multiplication table of a given number n.
//        int n=6;
//        for(int i=1;i<=10;i++){
//            System.out.printf( "%d X %d = %d\n" ,n,i,i*n);
//        }

//Question 4: Write a program to print a multiplication table of 10 in reverse order.
//
//                int n=10;
//        for(int i=10;i>=1;i--){
//            System.out.printf( "%d X %d = %d\n" ,n,i,i*n);
//        }

       // Question 5: Write a program to find the factorial of a given number using for loops.
        //int n = 5;
//        // What is factorial n = n * n-1 * n-2 ..... 1
//        // 5! = 5*4*3*2*1 = 120

//        int n=4;int fact=1;
//         for(int i=1;i<=n;i++){
//            fact=fact*i;
//        }
//        System.out.println(fact);

   //Question 6: Repeat problem 5 using a while loop.
//
//        int n=4;int fact=1;int i=1;
//        while(i<=n){
//            fact=fact*i;
//            i++;
//        }
//        System.out.println(fact);

//Question 9: Write a program to calculate the sum of the numbers occurring in the multiplication table of 8.
        int n=8;int sum=0;
        for(int i=1;i<=10;i++){
            sum=sum+ (n*i);

        }
        System.out.println(sum);
    }
}
