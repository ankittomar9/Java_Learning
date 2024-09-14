package com.company;

import java.util.Locale;

public class cwh_14_string_method {
    public static void main(String[] args) {
        //String name
        String name =new String("Ankit");
        System.out.println(name);

        //String length
        int name1= name.length();
        System.out.println(name1);

        //String lowercase
                String lstring =name.toLowerCase();
        System.out.println(lstring);

            //String Uppercase
        String uppercase =name.toUpperCase();
        System.out.println(uppercase);

        //non trimmed
        String nontrimmed= "          Ankit             ";
        System.out.println(nontrimmed);

        //String trimmed
        String trimmed=nontrimmed.trim();
        System.out.println(trimmed);

        //Substring
        System.out.println(name.substring(3));
        System.out.println(name.substring(1,4));

        //Replace
        String s="Harry";
        System.out.println(s.replace('r' ,'p'));
        System.out.println(name.replace("it" ,"ur"));

        //startsWith
        System.out.println(name.startsWith("TU"));
        System.out.println(name.startsWith("An"));

        //startsWith char at
        System.out.println(name.charAt(2));
        System.out.println(name.charAt(4));

        System.out.println(name.indexOf("k"));

        String modifiedName= "Harryrryrry";
        System.out.println(modifiedName.indexOf("rry"));
        System.out.println(modifiedName.indexOf("rry",4));
        System.out.println(modifiedName.lastIndexOf("rry",7));

        System.out.println(name.equals("Ankit"));

        System.out.println(name.equalsIgnoreCase("AnKIt"));


    }
}
