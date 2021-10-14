package com.generation;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        int num1, num2;
        Scanner console = new Scanner( System.in);

        System.out.print("Enter addition number 1  ");
        num1 = console.nextInt();
        System.out.print("Enter addition number 2  ");
        num2 = console.nextInt();
        suma (num1, num2);


        System.out.print("Enter subtraction number 1  ");
        num1 = console.nextInt();
        System.out.print("Enter subtraction number 2  ");
        num2 = console.nextInt();
        subtraction(num1, num2);


        System.out.print("Enter multiplication number 1  ");
        num1 = console.nextInt();
        System.out.print("Enter multiplication number 2  ");
        num2 = console.nextInt();
        multiplication(num1, num2);

        System.out.print("Enter division number 1  ");
        num1 = console.nextInt();
        System.out.print("Enter division number 2  ");
        num2 = console.nextInt();
        division (num1, num2);
    }
    public static int suma (int n1, int n2) {
        int addition = n1 + n2;
        System.out.println(n1 + " + "+ n2 +" = " + addition);
        return 0;
    }
    public static int subtraction (int n1, int n2) {
        int subtraction = n1 - n2;
        System.out.println(n1 + " - "+ n2 +" = " + subtraction);
        return 0;
    }
    public static int multiplication (int n1, int n2) {
        int multiplication = n1 * n2;
        System.out.println(n1 + " * "+ n2 +" = " + multiplication);
        return 0;
    }
    public static int division (int n1, int n2) {
        int division = n1 / n2;
        System.out.println(n1 + " / "+ n2 +" = " + division);
        return 0;
    }
}
