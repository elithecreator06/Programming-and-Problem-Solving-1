/*
Class: CSE 1321L
Section: 2
Term: Spring 2024
Instructor: Eun Sik Kim
Name:Emmanuel Durojaiye
Lab#: 2
*/

import java.util.Scanner;
public class Lab2A {
    public static void main(String[] args)
    {
        String userInput1;
        System.out.print("Enter a name: ");
        Scanner sc = new Scanner(System.in);
        userInput1 = sc.nextLine();
        String userInput2;
        System.out.print("Enter another name: ");
        userInput2 = sc.nextLine();
        String userInput3;
        System.out.print("Enter a verb: ");
        userInput3 = sc.nextLine();
        String userInput4;
        System.out.print("Enter an adverb: ");
        userInput4 = sc.nextLine();

        System.out.print("Once upon a time, there was a person named " + userInput1 + " who had a child named " + userInput2 + ". This child would " + userInput3 + " " + userInput4 + " while singing to strangers.");
    }
}
