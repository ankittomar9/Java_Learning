package com.company;

public class cwh_28_multi_dim_array {
    public static void main(String[] args) {
        int [] marks ;// array 1-D
        int [][] matrix;// array 2-D
        matrix= new int [2][3];

        matrix[0][0]=101;
        matrix[0][1]=102;
        matrix[0][2]=103;

        matrix[1][0]=201;
        matrix[1][1]=202;
        matrix[1][2]=203;


        //Displaying the 2-D Array (for loop)
        for(int i=0;i<matrix.length;i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]);
                System.out.print(" ");

            }
            System.out.println(""); // line change
        }


    }
}
