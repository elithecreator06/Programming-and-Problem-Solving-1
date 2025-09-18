/*
Class: CSE 1321L
Section: WJ3
Term: Spring 2024
Instructor: Eun Sik Kim
Name: Emmanuel Durojaiye
Lab#: 11B
*/

import java.util.Scanner;
public class Lab11B {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String password;
        char lowerValues = 65;
        char upperValues = 90;
        char lowerValues1 = 48;
        char upperValues2 = 57;
        boolean isValidPassword = false;

        System.out.print("Enter a password: ");
        password = sc.next();
        char[] passWord = password.toCharArray();

        if(passWord.length >= 8){
            for(int i = 1; i < passWord.length; i++){
                if(passWord[i] <= upperValues && passWord[i] >= lowerValues){
                    isValidPassword = true;
                    break;
                }
            }
            for(int i = 1; i < passWord.length; i++){
                if((passWord[i] >= lowerValues1 && passWord[i] <= upperValues2)){
                    isValidPassword = true;
                    break;
                }else{
                    isValidPassword = false;
                }
            }
        }
        if(isValidPassword){
            System.out.println("Valid password");
        }else{
            System.out.println("Invalid password");
        }
        System.out.println("\nProgram Ends");
    }
}
