/*
Class: CSE 1321L
Section: 1
Term: Spring 2024
Instructor: Eun Sik Kim
Name:Emmanuel Durojaiye
Assignment#: 1
*/

import java.util.Scanner;
public class Assignment1C {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("How far your donation goes ");
        System.out.println();

        System.out.print("How many cans of soups?" );
        int soups = sc.nextInt();
        System.out.print("How many bags of rice?" );
        int rice = sc.nextInt();
        System.out.print("How many cans of vegetables? ");
        int veg = sc.nextInt();
        System.out.print("How many cans of peanut butter? ");
        int peanutB = sc.nextInt();

        int numOfSoups = 2 * soups;
        int numOfRice = 4 * rice;
        double numOfVeg = 3.5 * veg;
        int numOfPeanut = 7 * peanutB;

        double total = numOfSoups + numOfRice + numOfVeg + numOfPeanut;
        System.out.println();
        System.out.println("Your donation will help feed " + total + " people!");
        System.out.println(numOfSoups + " people with the " + soups + " can(s) of soup");
        System.out.println(numOfRice + " people with the " + rice + " bag(s) of rice");
        System.out.println(numOfVeg +  " people with the " + veg + " can(s) of vegetables");
        System.out.println(numOfPeanut + " people with the " + peanutB + " can(s) of peanut butter");




    }
}
