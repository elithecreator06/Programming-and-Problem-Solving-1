/*
Class: CSE 1321L
Section: WJ3
Term: Spring 2024
Instructor: Eun Sik Kim
Name:Emmanuel Durojaiye
Assignment#: 4A
*/

import java.util.Scanner;
public class Assignment4A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int width;
        char character;

        System.out.print("Enter a character to use: ");
        character = sc.next().charAt(0);
        do{
            System.out.print("Enter the diamond's width: ");
            width = sc.nextInt();

            if(width >= 3){
                if(width % 2 == 0){
                    width = width + 1;
                    System.out.println("To make a diamond, we’ll use " + width + " as the width instead.");
                }
                width = width / 2 + 1;
                for (int i = 1; i < width; i++){
                    for (int j = i; j <= width; j++){
                        System.out.print(" ");
                    }
                    for (int j = 1; j < i; j++){
                        System.out.print(character);
                    }
                    for (int j = 1; j <= i; j++){
                        System.out.print(character);
                    }
                    System.out.println();
                }
                for (int i = 1; i <= width; i++) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print(" ");
                    }
                    for (int j = i; j < width; j++) {
                        System.out.print(character);
                    }
                    for (int j = i; j <= width; j++) {
                        System.out.print(character);
                    }
                    System.out.println();
                }
            }
            else if(width < 2){
                System.out.println("Please enter a width of at least 3.");
            }
        }while(width < 2);
    }
}
