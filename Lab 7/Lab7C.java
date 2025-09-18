/*
Class: CSE 1321L
Section: WJ3
Term: Spring 2024
Instructor: Eun Sik Kim
Name:Emmanuel Durojaiye
Lab#: 7C
*/

import java.util.Scanner;
public class Lab7C {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int size;

        System.out.print("Please enter a value for the size: ");
        size = scan.nextInt();
        System.out.println("This is the requested " + size +"x" + size + " right-triangle: ");

        for(int i = 1; i <= size; i++)
        {
            for(int j = i; j <= size; j++)
            {
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
