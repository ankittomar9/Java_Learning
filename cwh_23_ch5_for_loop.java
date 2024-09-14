package com.company;

public class cwh_23_ch5_for_loop {
    public static void main(String[] args) {
//        int n =20;
//        for(int i=1;i<=n;i++) {
//            if (i % 2 != 0) {
//                System.out.println(i);
//            }
//        }
        //2n= Even Numbers = 0,2,4,6,8
        //2n+1= Odd Numbers = 1,3,5,7,9
        //Odd number print
        int j=0;int m=10;
        for( j=0;j<m;j++){
            System.out.println(2*j+1);
        }

        // Reverse for  loop
        int z=10;
        for(int k=20;k>z;k--){
            System.out.println(k);
        }
    }
}
