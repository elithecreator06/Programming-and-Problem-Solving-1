/*
Class: CSE 1321L
Section: WJ3
Term: Spring 2024
Instructor: Eun Sik Kim
Name: Emmanuel Durojaiye
Lab#: 10A
*/


import java.util.Scanner;
public class Lab10A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num1;
        int num2;

        System.out.print("Enter number 1: ");
        num1 = sc.nextInt();
        System.out.print("Enter number 2: ");
        num2 = sc.nextInt();

        System.out.println("Min is " + min(num1, num2));
        System.out.println("Max is " + max(num1, num2));
        System.out.println("Average is " + average(num1, num2));
    }

    public static int min(int x, int y){
        if(x > y){
            return y;
        }

        if(x < y){
            return x;
        }
        return min(x,y);
    }

    public static int max(int x, int y){
        if(x > y){
            return x;
        }

        if(x < y){
            return y;
        }
        return max(x,y);
    }

    public static double average(int x, int y){
        return (x + y) / 2.0;
    }
}
