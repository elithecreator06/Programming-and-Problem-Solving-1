/*
Class: CSE 1321L
Section: 3
Term: Spring 2024
Instructor: Eun Sik Kim
Name:Emmanuel Durojaiye
Lab#: 3
*/
import java.util.Scanner;
public class Lab3B {
    public static void main(String[] args)
    {
        float course1, course2, course3, course4;
        float grade1, grade2, grade3, grade4;
        float totalHours, totalPoints, GPA;

        Scanner scan = new Scanner(System.in);
        System.out.print("Course 1 hours: ");
        course1 = scan.nextFloat();
        System.out.print("Grade for course 1: ");
        grade1 = scan.nextFloat();
        System.out.print("Course 2 hours: ");
        course2 = scan.nextFloat();
        System.out.print("Grade for course 2: ");
        grade2 = scan.nextFloat();
        System.out.print("Course 3 hours: ");
        course3 = scan.nextFloat();
        System.out.print("Grade for course 3: ");
        grade3 = scan.nextFloat();
        System.out.print("Course 4 hours: ");
        course4 = scan.nextFloat();
        System.out.print("Grade for course 4: ");
        grade4 = scan.nextFloat();

        totalHours = course1 + course2 + course3 + course4;
        System.out.println("Total hours is: " + totalHours);

        totalPoints = course1 * grade1 + course2 * grade2 + course3 * grade3 + course4 * grade4;
        System.out.println("Total quality points is: " + totalPoints);

        GPA = totalPoints / totalHours;
        System.out.println("Your GPA for this semester is " + GPA);




    }
}
