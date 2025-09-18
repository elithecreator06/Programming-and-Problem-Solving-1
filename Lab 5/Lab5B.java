/*
Class: CSE 1321L
Section: 5
Term: Spring 2024
Instructor: Eun Sik Kim
Name:Emmanuel Durojaiye
Lab#: 5
*/

import java.util.Scanner;
public class Lab5B {
    public static void main(String[] args)
    {
        int num, d2, d3, d5;
        int divisible = 0;

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        num = scan.nextInt();

        d2 = num % 2;
        d3 = num % 3;
        d5 = num % 5;

       if(d2 == 0)
       {
           divisible = 2;
       }else if(d3 == 0)
       {
           divisible = 3;
       }else if(d5 == 0)
       {
           divisible = 5;
       }else{
           System.out.print("This number is undetermined");
       }



        switch(divisible)
        {
            case 2 -> System.out.print("This number is divisible by 2");
            case 3 -> System.out.print("This number is divisible by 3");
            case 5 -> System.out.print("This number is divisible by 5");
            
        }

    }
}
