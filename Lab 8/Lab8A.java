/*
Class: CSE 1321L
Section: WJ3
Term: Spring 2024
Instructor: Eun Sik Kim
Name:Emmanuel Durojaiye
Lab#: 8A
*/

import java.util.Scanner;
public class Lab8A{
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter 5 integers for the first array: ");
        int[] a1 = new int[5];
        for(int i = 0; i < a1.length; i++){
            System.out.print("Integer " + (i+1) + ": ");
            a1[i] = scan.nextInt();
        }
        System.out.println("\nPlease enter 5 integers for the second array: ");
        int[] a2 = new int[5];
        for(int i = 0; i < a2.length; i++){
            System.out.print("Integer " + (i+1) + ": ");
            a2[i] = scan.nextInt();
        }
        int[] a3 = new int[5];
        for(int i = 0; i < a3.length; i++){
            a3[i] = a1[i] + a2[i];
        }

        System.out.println("\nThe resulting sums are " + a3[0] +"|" + a3[1] + "|" + a3[2] + "|" + a3[3] + "|" + a3[4] + "|");
    }
}
