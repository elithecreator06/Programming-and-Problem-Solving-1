/*
Class: CSE 1321L
Section: WJ3
Term: Spring 2024
Instructor: Eun Sik Kim
Name: Emmanuel Durojaiye
Lab#: 10B
*/

import java.util.Scanner;
public class Lab10B {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double width;
        double height;
        String continues;

        do{
            System.out.print("Enter width: ");
            width = sc.nextDouble();
            System.out.print("Enter height: ");
            height = sc.nextDouble();


            if(isValid(width, height)){
                System.out.println("This is a valid rectangle");
                System.out.println("The area is: " + area(width, height));
                System.out.println("The perimeter is: " + perimeter(width, height));
            }else{
                System.out.println("This is an invalid rectangle");
            }

            System.out.print("\nDo you want to enter another width and height (Y/N)? : ");
            continues = sc.nextLine();
        }while(continues.equals("Y") || continues.equals("y"));

        System.out.println("\nProgram Ends");
    }

    public static boolean isValid(double width, double height){
        double sum = width + height;
        return sum > 30;
    }

    public static double area(double width, double height){
        return width * height;
    }

    public static double perimeter(double width, double height){
        return (width * 2.0) + (height * 2.0);
    }
}
