/*
Class: CSE 1321L
Section: WJ3
Term: Spring 2024
Instructor: Eun Sik Kim
Name:Emmanuel Durojaiye
Assignment#: 5A
*/

import java.util.Scanner;
import java.util.Random;
public class Assignment5A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Scanner scan = new Scanner(System.in);
        Random rc = new Random();
        String compRPS = "0";
        String playerRPS;

        System.out.print("How many games do you want to play?: ");
        int rounds = sc.nextInt();

        String[] rps = new String[3];
        rps[0] = "Rock";
        rps[1] = "Paper";
        rps[2] = "Scissors";
        String[] result = new String[rounds];

        for(int i = 0; i <= rounds; i++) {
            if (i == rounds) {
                System.out.println("Game Over...");
                break;
            }

            System.out.print("Round " + (i + 1) + ": What do you want to throw?: ");
            playerRPS = scan.nextLine();
            int numb = rc.nextInt(3);


            if (numb == 0) {
                compRPS = rps[0];
            }
            if (numb == 1) {
                compRPS = rps[1];
            }
            if (numb == 2) {
                compRPS = rps[2];
            }
            if (compRPS.equals(rps[0])) {
                System.out.println("Computer threw ROCK!");
            }
            if (compRPS.equals(rps[1])) {
                System.out.println("Computer threw PAPER!");
            }
            if (compRPS.equals(rps[2])) {
                System.out.println("Computer threw SCISSORS!");
            }
            if (playerRPS.equals("Rock") && compRPS.equals(rps[0])) {
                result[i] = "Tied on Round " + (i + 1) + " with Rock";
            }
            if (playerRPS.equals("Rock") && compRPS.equals(rps[1])) {
                result[i] = "Computer won Round " + (i + 1) + " with Paper";
            }
            if (playerRPS.equals("Rock") && compRPS.equals(rps[2])) {
                result[i] = "Player won Round " + (i + 1) + " with Rock";
            }
            if (playerRPS.equals("Paper") && compRPS.equals(rps[0])) {
                result[i] = "Player won Round " + (i + 1) + " with Paper";
            }
            if (playerRPS.equals("Paper") && compRPS.equals(rps[1])) {
                result[i] = "Tied on Round " + (i + 1) + " with Paper";
            }
            if (playerRPS.equals("Paper") && compRPS.equals(rps[2])) {
                result[i] = "Computer won Round " + (i + 1) + " with Scissors";
            }
            if (playerRPS.equals("Scissors") && compRPS.equals(rps[0])) {
                result[i] = "Computer won Round " + (i + 1) + " with Rocks";
            }
            if (playerRPS.equals("Scissors") && compRPS.equals(rps[1])) {
                result[i] = "Player won Round " + (i + 1) + " with Scissors";
            }
            if (playerRPS.equals("Scissors") && compRPS.equals(rps[2])) {
                result[i] = "Tied on Round " + (i + 1) + " with Scissors";
            }
        }


        System.out.println();
        System.out.println("Here’s the recap:");
        for(int i = 0; i < rounds; i++){
            System.out.println(result[i]);
        }

    }
}
