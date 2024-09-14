package com.company;
public class cwh_32_method_overloading {
    static void foo(){
        System.out.println("Good Morning bro !!!");
    }

        static  void foo(int a){
            System.out.println(" Good morning  " + a + " brosef !");
        }

    static  void foo(int a,int b){
        System.out.println(" Good morning  " + a + " brosef !");
        System.out.println(" Good morning  " + b + " brosef !");
    }

    static void tellJoke(){
        System.out.println("I invented a new word! \n "+ "Plagiarism!!!!!");
    }
    static void change(int a){
        a=98;
    }



    static void change2(int[] arr ){ // Object reference is copied which changes the values when object is returned from method
        arr[0]=98;
    }

    public static void main(String[] args) {

        tellJoke();

        int[]  marks={52,73,77,89,98,94};
        change2(marks);
        System.out.println("The value after running the change is : " +marks[0]);

        //method Overloading
        foo();
        foo(1000);
        foo(1000,2000);  // arguments are actual values // a and b is parameters

    }

}
