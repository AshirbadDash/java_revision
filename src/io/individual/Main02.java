package io.individual;

import java.util.Scanner;

public class Main02 {
    public static void main(String[] args) {
//
//        String pattern = "*";
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < i + 1; j++) {
//                System.out.print(pattern);
//            }
//            System.out.println();
//        }
//
//        int a = 10;
//        int b = 20;
//        int sum = a + b;
//        System.out.println(sum);

//variables are the container from which we can store ,retrieve the data efficiently
        //ram everything in memory is in the form of zero and one
        //the values are broken down and then converted to 0 and 1
        //the computer give some address to all the 0/1 present in ram
        //the computer stores the value in the  address and returns it
        //when declared a variable it is stored in the memory
        //memory cell//location has some address and name .internally it gets the address with the name

        //type of variable is used to define what type of values will be stored in that variable
        //


        //naming conventions
        //camel case
        //starts with lower case letter .capitalize the first letter of each subsequent word

        //snake_case
        //start with a lower case letter .separate words with underscore

        //kebab-case
        //all lowercase letters .separate word with hyphens

        //variables use camel case
        //class use pascal case

        //java identifier rules
        //the name of the variables are called as identifier
        //the value of the variable are called as literals

        //there are around 68 keyword which we canned use as identifiers


        //escape sequences
        //tells that the string is not end till now
        //we can use backslash

        //user input

        Scanner sc = new Scanner(System.in);
//        System.out.print("please enter your name ");
//        String name =sc.nextLine();
//        System.out.println("welcome " +name +" to KG Coding");
//
//
//
//
//        System.out.println("enter number 1");
//        int num1 = sc.nextInt();
//        System.out.println("enter number 2");
//        int num2 = sc.nextInt();
//        int sum = num1 + num2;
//        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);
//
        //implicit
        float myFloat = 5;
        System.out.println(myFloat);

        //explicit
        int myInt = (int) 5f;
        System.out.println(myInt);




    }
}
