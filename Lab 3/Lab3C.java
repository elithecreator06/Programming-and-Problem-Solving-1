/*
Class: CSE 1321L
Section: 3
Term: Spring 2024
Instructor: Eun Sik Kim
Name:Emmanuel Durojaiye
Lab#: 3
*/
import java.util.Scanner;
public class Lab3C {
    public static void main(String[] args)
    {
        int quarters, dimes, nickels, pennies;
        int dollars, cents, total;

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of quarters: ");
        quarters = scan.nextInt();
        System.out.print("Enter the number of dimes: ");
        dimes = scan.nextInt();
        System.out.print("Enter the number of nickels: ");
        nickels = scan.nextInt();
        System.out.print("Enter the number of pennies: ");
        pennies = scan.nextInt();

        System.out.println("\nYou entered " + quarters + " quarters. ");
        System.out.println("You entered " + dimes + " dimes. ");
        System.out.println("You entered " + nickels + " nickels. ");
        System.out.println("You entered " + pennies + " pennies. ");

        total =  (quarters * 25) + (dimes * 10) + (nickels * 5) + (pennies);

        dollars = total / 100;
        cents = total % 100;

        System.out.print("\nYour total is " + dollars + " dollars and " + cents + " cents.");


    }
}
