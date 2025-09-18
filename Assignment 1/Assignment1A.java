/*
Class: CSE 1321L
Section: 1
Term: Spring 2024
Instructor: Eun Sik Kim
Name:Emmanuel Durojaiye
Assignment#: 1
*/

import java.util.Scanner;
public class Assignment1A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Lets make a website (URL)!");
        System.out.println();

        System.out.print("Scheme: ");
        String scheme = sc.nextLine();
        System.out.print("Subdomain: ");
        String subdomain = sc.nextLine();
        System.out.print("Second-level domain: ");
        String secondL= sc.nextLine();
        System.out.print("Top-level domain: ");
        String topL = sc.nextLine();
        System.out.print("Subdirectory: ");
        String subdirect = sc.nextLine();

        System.out.println();
        System.out.println("Your URL is: ");
        System.out.println(scheme + "://" + subdomain + "." + secondL + "." + topL + "/" + subdirect);



    }
}
