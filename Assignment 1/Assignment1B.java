/*
Class: CSE 1321L
Section: 1
Term: Spring 2024
Instructor: Eun Sik Kim
Name:Emmanuel Durojaiye
Assignment#: 1
*/

import java.util.Scanner;
public class Assignment1B {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("First color");
        System.out.print("R: ");
        int r = sc.nextInt();
        System.out.print("G: ");
        int g = sc.nextInt();
        System.out.print("B: ");
        int b = sc.nextInt();

        System.out.println();
        System.out.println("Second color");
        System.out.print("R: ");
        int r2 = sc.nextInt();
        System.out.print("G: ");
        int g2 = sc.nextInt();
        System.out.print("B: ");
        int b2 = sc.nextInt();

        double distance = Math.sqrt((r2-r) * (r2-r) + (g2-g) * (g2-g) + (b2-b) * (b2-b));

        System.out.println();
        System.out.println("Color Distance: " + distance);
    }
}
