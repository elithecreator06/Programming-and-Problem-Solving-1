/*
Class: CSE 1321L
Section: 3
Term: Spring 2024
Instructor: Eun Sik Kim
Name:Emmanuel Durojaiye
Lab#: 3
*/
import java.util.Scanner;
public class Lab3A {
    public static void main(String[] args)
    {
        int amount;
        double APR, mPercentage, miniPay;


        Scanner scan = new Scanner(System.in);

        System.out.print("Amount owed: $");
        amount = scan.nextInt();

        System.out.print("APR: ");
        APR = scan.nextFloat();

        mPercentage = Math.round(APR / 12 * 1000.0) / 1000.0;
        System.out.println("Monthly percentage rate: " + mPercentage);

        miniPay = Math.round(amount * APR / 100 / 12 * 100.0) / 100.0;
        System.out.print("Minimum payment: $" + miniPay);

    }
}
