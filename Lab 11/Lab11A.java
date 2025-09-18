/*
Class: CSE 1321L
Section: WJ3
Term: Spring 2024
Instructor: Eun Sik Kim
Name: Emmanuel Durojaiye
Lab#: 11A
*/

import java.util.Scanner;
public class Lab11A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input;
        String rerun;

        do {
            System.out.println("Menu");
            System.out.println("0) Hello World");
            System.out.println("1) Goodbye Moon");
            System.out.println("2) Walking on Sunshine");
            System.out.println();
            System.out.print("What would you like to do: ");

            input = sc.nextInt();
            switch(input){
                case 0 -> System.out.println("\nHello!");
                case 1 -> System.out.println("\nOk, bye.");
                case 2 -> System.out.println("\nWHOA!");
            }
            System.out.print("\nType YES to rerun. ");
            rerun = sc.next();
            System.out.println(" ");
        }while(rerun.equalsIgnoreCase("yes"));

        System.out.println("Program Ends");
    }
}


