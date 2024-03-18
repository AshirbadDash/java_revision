package io.individual;

import java.util.Scanner;

public class Main06 {
    public static void main(String[] args) {
//        boolean isMale = true;
//
//        String name = "bob";
//        if (isMale) {
//            System.out.println("Mr." + name);
//        } else {
//            System.out.println("you are a female");
//        }
//        System.out.println("hello world");
////create a program to determine the number is positive negative or zero

        Scanner sc = new Scanner(System.in);

        System.out.print("welcome\n\n");
//
//        System.out.print("enter the number ");
//        int num = sc.nextInt();
//
//        if (num > 0) {
//            System.out.println("your number is positive");
//        } else if (num == 0) {
//            System.out.println("your number is zero");
//        } else {
//            System.out.println("your number is zero");
//        }
//
//


        //check odd even

//        while (true) {
//
//            System.out.print("enter your number ");
//            int num = sc.nextInt();
//            if (num % 2 == 0) {
//                System.out.println(num + " is an even number");
//            } else if (num == -1) {
//                System.exit(0);
//            } else {
//                System.out.println(num + " is an odd number");
//            }
//
//        }
//    }


        //check greatest of 3 numbers

//
//        System.out.println("enter the three numbers ");
//        int num1 = sc.nextInt();
//        int num2 = sc.nextInt();
//        int num3 = sc.nextInt();
//
//        if (num1 >= num2 && num1 >= num3) {
//            System.out.println(num1 + " is greatest");
//        } else if (num2 >= num3) {
//            System.out.println(num2 + " is greatest");
//
//        } else {
//            System.out.println(num3 + " is greatest");
//        }


        //check if year is a leap year


//        //assigning grades
//        System.out.println("enter the percentage of student");
//        double per = sc.nextDouble();
//        if (per >= 90) {
//            System.out.println("A grade");
//        } else if (per >= 75) {
//            System.out.println("B grade");
//
//        } else if (per >= 60) {
//            System.out.println("C grade");
//
//        } else if (per >= 30) {
//            System.out.println("D grade");
//        } else {
//            System.out.println("F grade");
//        }


        //checking age

        System.out.println("enter the age");
        int age = sc.nextInt();
        if (age >= 65) {
            System.out.println("you are a senior");
        } else if (age >= 20) {
            System.out.println("you are a teen");
        } else {
            System.out.println("you are a child");

        }

    }

}



