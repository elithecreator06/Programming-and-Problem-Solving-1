/*
Class: CSE 1321L
Section: 2
Term: Spring 2024
Instructor: Eun Sik Kim
Name:Emmanuel Durojaiye
Assignment#: 2
*/

import java.util.Scanner;
public class Assignment2A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number you want to find a multiple of: ");
        int num1 = sc.nextInt();
        System.out.print("Enter a second number: ");
        int num2 = sc.nextInt();
        System.out.println("Calculating...");
        int num3 = num2 % num1;
        int num4 =  num2 - num3;
        System.out.print("The nearest multiple of " +num1+ " from " +num2+ " is " +num4+ "!");
    }
}
