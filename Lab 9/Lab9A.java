/*
Class: CSE 1321L
Section: WJ3
Term: Spring 2024
Instructor: Eun Sik Kim
Name: Emmanuel Durojaiye
Lab#: 9A
*/

import java.util.Scanner;
public class Lab9A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int targetNum;

        System.out.println("Please enter 10 numbers: ");

        int[] num = new int[10];

        for(int i = 0; i < num.length; i++){
            System.out.print("Integer " + (i+1) + ": ");
            num[i] = sc.nextInt();

            if(i == (num.length - 1)){
                System.out.print("What is the target number: ");
                targetNum = sc.nextInt();
                for(int j = 0; j < num.length; j++) {
                    if(num[j] == targetNum) {
                        System.out.println("The target is in the set.");
                        break;
                    }
                    if(num[j] != targetNum && j ==(num.length-1)){
                        System.out.println("The target is not in the set.");
                        break;
                    }
                }
            }
        }
    }
}
