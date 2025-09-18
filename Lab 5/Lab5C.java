/*
Class: CSE 1321L
Section: 5
Term: Spring 2024
Instructor: Eun Sik Kim
Name:Emmanuel Durojaiye
Lab#: 5
*/

import java.util.Scanner;
public class Lab5C {
    public static void main(String[] args)
    {
        int x, y;

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter x: ");
        x = scan.nextInt();

        System.out.print("Enter y: ");
        y = scan.nextInt();

        if(x == 0 && y ==0)
        {
            System.out.print("This point is the origin.");
        }else if(x == 0 && y != 0 )
        {
            System.out.print("This point is on the y axis.");
        }else if(x != 0 && y == 0)
        {
            System.out.print("This point is on the x axis.");
        }

        if(1 <= x && x <= 6 && 1 <= y && y <= 4)
        {
            System.out.print("This point is in the first quadrant.");
        }else if(-1 >= x && x >= -6 && 1 <= y && y <= 4)
        {
            System.out.print("This point is in the second quadrant. ");
        }else if(-1 >= x && x >= -6 && -1 >= y && y >= -4)
        {
            System.out.print("This point is in the third quadrant. ");
        }else if(1 <= x && x <= 6 && -1 >= y && y >= -4)
        {
            System.out.print("This point is in the fourth quadrant. ");
        }
    }
}
