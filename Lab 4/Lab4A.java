/*
Class: CSE 1321L
Section: 4
Term: Spring 2024
Instructor: Eun Sik Kim
Name:Emmanuel Durojaiye
Lab#: 4
*/
import java.util.Scanner;
public class Lab4A {
    public static void main (String[] args)
    {
        double score;

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the score of your exam: ");
        score = scan.nextDouble();

        if (score >= 97.5 ){
            System.out.print("Letter grade is: A+");
        }else if(score >= 94.5){
            System.out.print("Letter grade is: A");
        }else if(score >= 91.5){
            System.out.print("Letter grade is: A-");
        }else if (score >= 88.5){
            System.out.print("Letter grade is: B+");
        }else if (score >= 85.5){
            System.out.print("Letter grade is: B");
        }else if (score >= 82.5){
            System.out.print("Letter grade is: B-");
        }else if (score >= 79.5){
            System.out.print("Letter grade is: C+");
        }else if (score >= 76.5){
            System.out.print("Letter grade is: C");
        }else if(score >= 73.5){
            System.out.print("Letter grade is: C-");
        }else if(score >= 70.5){
            System.out.print("Letter grade is: D+");
        }else if (score >= 67.5){
            System.out.print("Letter grade is: D");
        }else if (score >= 64.5){
            System.out.print("Letter grade is: D-");
        }else if (score >= 0){
            System.out.print("Letter grade is: F");
        }
    }
}
