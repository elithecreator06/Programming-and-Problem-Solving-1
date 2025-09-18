/*
Class: CSE 1321L
Section: WJ3
Term: Spring 2024
Instructor: Eun Sik Kim
Name:Emmanuel Durojaiye
Assignment#: 4C
*/

import java.util.Scanner;
public class Assignment4C {
    public static void main(String[] args) throws InterruptedException{
        Scanner sc = new Scanner(System.in);

        System.out.println("[Backspace Animation]");
        System.out.println("Please enter your sentence:");
        String sentence = sc.nextLine();

        System.out.println("How many letters do you want to backspace?");
        int backspace = sc.nextInt();


        System.out.print(sentence);

        for(int i = 0; i < backspace; i++){
            System.out.print("\b");
            Thread.sleep (500);
        }
        System.out.println();
    }
}
