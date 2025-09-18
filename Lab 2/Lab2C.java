/*
Class: CSE 1321L
Section: 2
Term: Spring 2024
Instructor: Eun Sik Kim
Name:Emmanuel Durojaiye
Lab#: 2
*/

import java.util.Scanner;
public class Lab2C {
    public static void main(String[] args)
    {
        int width;
        int height;
        int area, perimeter;
        Scanner scan = new Scanner (System.in);
        System.out.print("Enter a width: ");
        width = scan.nextInt();
        System.out.print("Enter a height: ");
        height = scan.nextInt();
        area = width * height;
        perimeter = width * 2 + height * 2;
        System.out.println("The area is " + area);
        System.out.println("The perimeter is " + perimeter);

    }
}
