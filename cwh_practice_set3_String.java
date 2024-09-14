package com.company;

import java.util.Locale;

public class cwh_practice_set3_String {
    public static void main(String[] args) {

     //   question 1
        String name="Jack Parker";
        System.out.println(name.toLowerCase());

        //question 2
        String str="I am learning Java";
        str =str.replace(" ","_");
        System.out.println(str);

        //question 3
        String letter ="Dear <|name|>, Thanks a lot!";
        System.out.println(letter.replace("<|name|>","Ankit"));

        //question 4:
        String myString="This string contains   double and triple spaces";
        System.out.println(myString.indexOf("  "));
        System.out.println(myString.indexOf("   "));
        System.out.println(myString.indexOf("    "));

        //question 5
        String letter2 ="Dear Ankit,\n\tThis learning questions are practice.\n\tThanks";
        System.out.println(letter2);


    }
}
