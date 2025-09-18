/*
Class: CSE 1321L
Section: 5
Term: Spring 2024
Instructor: Eun Sik Kim
Name:Emmanuel Durojaiye
Lab#: 5
*/

import java.util.Scanner;

public class Lab5A {
    public static void main(String[] args)
    {
        String permit, license;

        Scanner sc = new Scanner(System.in);

        System.out.print("Do you have a driving permit (Y/N)? ");
        permit = sc.nextLine();
        if(permit.equalsIgnoreCase("N"))
        {
            System.out.print("Driving permit is a prerequisite to purchase a vehicle!");
        }else if(permit.equalsIgnoreCase("Y"))
        {
            System.out.print("Do you have a commercial driving license (Y/N)? ");
            license = sc.nextLine();
            if(license.equalsIgnoreCase("N"))
            {
                System.out.print("Commercial driving license is a prerequisite to purchase a vehicle!");
            }else if(license.equalsIgnoreCase("Y"))
            {
                System.out.print("Congratulations! You can purchase a vehicle, let’s start talking options!");
            }
        }
    }
}
