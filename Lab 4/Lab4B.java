/*
Class: CSE 1321L
Section: 4
Term: Spring 2024
Instructor: Eun Sik Kim
Name:Emmanuel Durojaiye
Lab#: 4
*/
import java.util.Scanner;
public class Lab4B {
    public static void main(String[] args)
    {
        String day;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the day: ");
        day = sc.nextLine();

        if(day.equalsIgnoreCase("Monday")) {
            System.out.print("I have class today!");
        }else if(day.equalsIgnoreCase("Wednesday")){
            System.out.print("I have class today!");
        }else if(day.equalsIgnoreCase("Friday")){
        System.out.print(" It’s Friday! Friday! Gotta get down on Friday!");
        }else{
            System.out.print("I should use this time to do my homework.");
        }
    }
}
