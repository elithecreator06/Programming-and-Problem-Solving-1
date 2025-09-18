/*
Class: CSE 1321L
Section: 6
Term: Spring 2024
Instructor: Eun Sik Kim
Name:Emmanuel Durojaiye
Lab#: 6
*/

import java.util.Scanner;
import java.util.Random;
public class Lab6B {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        int guess = rand.nextInt(1001);
        int userNum;
        int i = 0;

        System.out.print("Enter a number between 1 and 1000: ");
        userNum = scan.nextInt();

        while(guess != userNum){
            guess = rand.nextInt(1001);
            System.out.println("My guess was " + guess);
            i++;

            if(guess == userNum)
            {
                System.out.println("\nI guessed the number was " + guess + " and it only took me " + i + " guesses");
                break;
            }
        }
    }
}
