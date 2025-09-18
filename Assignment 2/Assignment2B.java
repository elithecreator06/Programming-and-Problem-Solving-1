/*
Class: CSE 1321L
Section: 2
Term: Spring 2024
Instructor: Eun Sik Kim
Name:Emmanuel Durojaiye
Assignment#: 2
*/

import java.util.Scanner;
public class Assignment2B {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the hit box bottom-left X coordinate: ");
        int xC = sc.nextInt();
        System.out.print("Enter the hit box bottom-left Y coordinate: ");
        int yC = sc.nextInt();
        System.out.print("Enter the width of the hit box: ");
        int width = sc.nextInt();
        System.out.print("Enter the height of the hit box: ");
        int height = sc.nextInt();
        System.out.println("[Hit Box Coordinates]");
        System.out.println("Bottom-Left: " + xC + ", " + yC);
        System.out.println("Top-Left: " + xC + ", " + (yC + height));
        System.out.println("Bottom-Right: " + (xC + width) + ", " + yC);
        System.out.println("Top-Right: " + (xC + width) + ", " + (yC + height));


    }
}
