/*
Class: CSE 1321L
Section: 3
Term: Spring 2024
Instructor: Eun Sik Kim
Name:Emmanuel Durojaiye
Assignment#: 3
*/

import java.util.Scanner;
public class Assignment3A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Scanner scan = new Scanner(System.in);
        System.out.println("[Scrappy’s Bucket List Rewards]");
        System.out.print("How many events have you attended? ");
        int events = sc.nextInt();

        if(events <= 6){
            System.out.println("Check out events at https://studentaffairs.kennesaw.edu/scrappysbucketlist/!");
        }else{
            int reward =(events * 100) / 63;
            System.out.println("You’ve been to " + reward + "% of all SBL events!");
            if(reward >= 10){
                System.out.println("You’ve earned a Drawstring Bag!");
            }
            if(reward >= 25){
                System.out.println("You’ve earned a Hat!");
            }
            if(reward >= 50){
                System.out.println("You've earned a T-shirt!");
            }
            if(reward >= 75){
                System.out.println("You've earned a a Glass Water Bottle!");
            }
            if(reward >= 100){
                System.out.println("You’ve earned a Hoodie!");
                System.out.print("Are you graduating? ");
                String grad = scan.nextLine();
                if(grad.equalsIgnoreCase("no")){
                    System.out.println("There’s a special reward when you graduate!");
                }else if(grad.equalsIgnoreCase("yes")){
                    System.out.println("Hooray, you earned a Challenge Coin and special graduation cords!");
                }
            }
        }
    }
}
