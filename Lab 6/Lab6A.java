/*
Class: CSE 1321L
Section: 6
Term: Spring 2024
Instructor: Eun Sik Kim
Name:Emmanuel Durojaiye
Lab#: 6
*/

import java.util.Scanner;
public class Lab6A {
    public static void main(String[] args)
    {
        int userNum;
        int largeNumb = 0;


        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter 10 numbers and this program will display the largest.");
        System.out.print("\n");

        for(int i = 1; i <= 10; i++) {

            System.out.print("Please enter number " + i + ": ");
            userNum = scan.nextInt();

            if(largeNumb < userNum)
            {
                largeNumb = userNum;
            }

        }
        System.out.print("\nThe largest number was " + largeNumb);
    }
}
