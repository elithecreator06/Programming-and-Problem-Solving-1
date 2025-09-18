/*
Class: CSE 1321L
Section: WJ3
Term: Spring 2024
Instructor: Eun Sik Kim
Name: Emmanuel Durojaiye
Lab#: 12A
*/

import java.util.Scanner;
public class Lab12A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num;
        boolean roll;
        String made;

        System.out.println("You are about to create a chair.");
        System.out.print("How many legs does your chair have: ");
        num = sc.nextInt();
        System.out.print("Is your chair rolling (true/false): ");
        roll = sc.nextBoolean();
        System.out.print("What is your chair made of: ");
        made = sc.next();
        System.out.println(" ");

        Chair youChair = new Chair(num, roll, made);
        String roller;
        if(youChair.rolling){
            roller = "rolling,";
        }else{
            roller = "not rolling,";
        }

        System.out.println("Your chair has " + youChair.numOfLegs + " legs, is " + roller + " and is made of " + youChair.material + ". ");
        System.out.println("\nThis program is going to change that.");

        youChair.numOfLegs = 4;
        youChair.rolling = false;
        youChair.material = "wood";
        if(!youChair.rolling){
            roller = "not rolling,";
        }else{
            roller = "rolling,";
        }

        System.out.println("\nYour chair has " + youChair.numOfLegs + " legs, is " + roller + " and is made of " + youChair.material + ". ");
    }

    public static class Chair{
        public int numOfLegs;
        public boolean rolling;
        public String material;
        Chair(int legs, boolean roll, String madeOf){
            numOfLegs = legs;
            rolling = roll;
            material = madeOf;
        }
    }
}


