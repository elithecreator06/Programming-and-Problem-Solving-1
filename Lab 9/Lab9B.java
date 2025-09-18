/*
Class: CSE 1321L
Section: WJ3
Term: Spring 2024
Instructor: Eun Sik Kim
Name: Emmanuel Durojaiye
Lab#: 9B
*/


import java.util.Scanner;

public class Lab9B {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] num = new int[11];
        int targetNum, key, position;
        int low = 0;
        int mid;
        int high = num.length - 1;
        boolean found = false;

        System.out.println("Please enter 11 numbers: ");

        for(int i = 0; i < num.length; i++) {
            System.out.print("Integer " + (i + 1) + ": ");
            num[i] = sc.nextInt();
        }

        System.out.print("What is the target number: ");
        targetNum = sc.nextInt();
        System.out.print("The sorted set is: ");
        for(int i = 1; i < num.length; i++){
            key = num[i];
            position = i;
            while (position > 0 && key < num[position -1]){
                num[position] = num[position - 1];
                position = position - 1;
            }
            num[position] = key;
        }
        for(int i : num){
            System.out.print(i+ " ");
        }
        System.out.println();
        while(high >= low){
            System.out.println("Low is " + low);
            System.out.println("High is " + high);
            mid = (low + high) / 2;
            System.out.println("Mid is " + mid);
            System.out.println("Searching");
            if(targetNum < num[mid]){
                high = mid - 1;
            }else if (targetNum == num[mid]){
                found = true;
                System.out.println("The target is in the set.");
                break;
            }else{
                low = mid + 1;
            }
        }

        if(!found) {
            System.out.print("The target is not in the set.");
        }
    }
}
