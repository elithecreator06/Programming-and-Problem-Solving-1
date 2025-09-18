/*
Class: CSE 1321L
Section: 4
Term: Spring 2024
Instructor: Eun Sik Kim
Name:Emmanuel Durojaiye
Lab#: 4
*/
import java.util.Scanner;
public class Lab4C {
    public static void main(String[] args)
    {
        double number, reciprocal, square, cube;
        int numberToDo;

        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome!");
        System.out.print("Please input a number: ");
        number = scan.nextDouble();

        System.out.println("\nWhat would you like to do to this number: " +
                "\n0) Get the additive inverse of the number" +
                " \n1) Get the reciprocal of the number " +
                " \n2) Square the number " +
                " \n3) Cube the number " +
                " \n4) Exit the program" +
                " \n");
        numberToDo = scan.nextInt();


        switch(numberToDo){
            case 0:
                System.out.print("\nThe additive inverse of " + number + " is -" + number);
                break;
            case 1:
                reciprocal = 1 / number;
                System.out.print("\nThe reciprocal of " + number + " is " + reciprocal);
                break;
            case 2:
                square = number * number;
                System.out.print("\nThe square of " + number + " is " + square);
                break;
            case 3:
                cube = number * number * number;
                System.out.print("\nThe cube of " + number + " is " + cube);
                break;
            case 4:
                System.out.print("\nThank you, goodbye!");
                break;
        }

        if(numberToDo >= 5){
            System.out.print("\nInvalid input, please try again!");
        }

    }
}
