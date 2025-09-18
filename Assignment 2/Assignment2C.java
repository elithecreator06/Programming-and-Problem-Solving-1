/*
Class: CSE 1321L
Section: 2
Term: Spring 2024
Instructor: Eun Sik Kim
Name:Emmanuel Durojaiye
Assignment#: 2
*/

import java.util.Scanner;
public class Assignment2C {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double britPound = 0.79;
        double bisonDollar = 5;

        System.out.println("Welcome to Bisonica!");
        System.out.print("How many US Dollars do you have? ");
        int usDollars = sc.nextInt();
        double brits = usDollars * britPound;
        double bison = brits / bisonDollar;
        System.out.println(usDollars + " US Dollar(s) is " +brits+ " British Pound(s), which is " +bison+ " Bison Dollar(s)!");

    }
}
