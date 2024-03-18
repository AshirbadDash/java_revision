package io.individual;

import java.util.Scanner;

public class Main05 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//
//        System.out.println("please enter the first number");
//        int num1 = sc.nextInt();
//        System.out.println("please enter the second number");
//        int num2 = sc.nextInt();
//
//        int add = num1 + num2;
//        System.out.println("The addition of " + num1 + " and " + num2 + " is " + add);
//        int sub = num1 - num2;
//        System.out.println("The subtraction of " + num1 + " and " + num2 + " is " + sub);
//        int mul = num1 * num2;
//        System.out.println("The multiplication of " + num1 + " and " + num2 + " is " + mul);
//        int div = num1 / num2;
//        System.out.println("The division of " + num1 + " and " + num2 + " is " + div);

//        System.out.println("enter the number 1");
//        float num1 = sc.nextFloat();
//        System.out.println("enter the number 2");
//        float num2 = sc.nextFloat();
//
//        float product = num1 + num2;
//        System.out.println(product);
//
//
//        System.out.println("enter the side all the four sides ");
//        double side1 = sc.nextDouble();
//        double side2 = sc.nextDouble();
//        double side3 = sc.nextDouble();
//        double side4 = sc.nextDouble();
//
//        double perimeter = side1 + side2 + side3 + side4;
//        System.out.println(perimeter);

//
//        //area of the triangle =1/2 *B*H
//        double base = sc.nextDouble();
//        double height = sc.nextDouble();
//        double area = 0.5 * base * height;
//        System.out.println("\nThe are of triangle is " + area+" cm"+);

//        //calculating dimple interest
//
//        int principal = sc.nextInt();
//        float rate = sc.nextFloat();
//        float years = sc.nextInt();
//        float interest = (principal * rate * years) / 100;
//        System.out.println(interest);

        //compound interest
//
//        System.out.println("welcome to compound Interest app");
//
//        int principle = sc.nextInt();
//        float rate = sc.nextFloat();
//        float years = sc.nextFloat();
//
//        double compoundInterest = principle * Math.pow((1 + rate / 100), years);
//        System.out.println(compoundInterest);

       //fahrenheit
        System.out.println("enter your temp in f");
        float fah=sc.nextFloat();
        float cel=(fah-32)*5/9;
        System.out.println(cel);



    }


}
