/*
Class: CSE 1321L
Section: 6
Term: Spring 2024
Instructor: Eun Sik Kim
Name:Emmanuel Durojaiye
Lab#: 6
*/

import java.util.Scanner;
public class Lab6C {
    public static void main(String[] args)
    {
        {
            char yesNo;
            int userIn;
            int deposit, withdraw;
            int newValue = 1000;

            Scanner scan = new Scanner(System.in);

            System.out.println("Welcome!\nYou have $1000 in your account.\n");
            do{
                System.out.println("""
                        Menu
                        0 - Make a deposit
                        1 - Make a withdrawal
                        2 - Display account value
                        """);
                System.out.print("Please make a selection: ");
                userIn = scan.nextInt();

                if(userIn == 0) {
                    System.out.print("How much would you like to deposit? : ");
                    deposit = scan.nextInt();
                    newValue = newValue + deposit;
                    System.out.println("Your current balance is $" + newValue);
                }else if(userIn == 1) {
                    System.out.print("How much would you like to withdraw? : ");
                    withdraw = scan.nextInt();
                    newValue = newValue - withdraw;
                    System.out.println("Your current balance is $" + newValue);
                }else if(userIn == 2) {
                    System.out.println("Your current balance is $" + newValue);
                }else{
                    System.out.println("Invalid entry, please try again.");
                }
                System.out.print("Would you like to return to the main menu (Y/N)? : ");
                yesNo = scan.next().charAt(0);
            }while(yesNo == 'Y' || yesNo == 'y');

            System.out.print("\nThank you for banking with us!");
        }
    }
}