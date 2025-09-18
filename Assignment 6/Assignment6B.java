/*
Class: CSE 1321L
Section: WJ3
Term: Spring 2024
Instructor: Eun Sik Kim
Name: Emmanuel Durojaiye
Assignment#: 6B
*/

import java.util.Scanner;
public class Assignment6B {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("[Overloaded Sort]");
        System.out.print("What data type do you want to enter? ");
        String type = sc.nextLine();

        if(type.equals("char")){
            char[] charArr = new char[8];
            for(int i = 0; i < 8; i++){
                System.out.print("Value " + (i + 1) + ": ");
                charArr[i] = sc.next().charAt(0);
            }
            System.out.println("Calling arraySort()...");
            arraySort(charArr);
            System.out.println("The sorted values are: ");
            System.out.print(charArr[0]);
            for(int i = 1; i < 8; i++){
                System.out.print(", " + charArr[i]);
            }

        }else if(type.equals("integer")){
            int[] intArr = new int[8];
            for(int i = 0; i < 8; i++) {
                System.out.print("Value " + (i + 1) + ": ");
                intArr[i] = sc.nextInt();
            }
            System.out.println("Calling arraySort()...");
            arraySort(intArr);
            System.out.println("The sorted values are: ");
            System.out.print(intArr[0]);
            for(int i = 1; i < 8; i++){
                System.out.print(", " + intArr[i]);
            }

        }else if(type.equals("float")){
            float[] floatArr = new float[8];
            for(int i = 0; i < 8; i++) {
                System.out.print("Value " + (i + 1) + ": ");
                floatArr[i] = sc.nextFloat();
            }
            System.out.println("Calling arraySort()...");
            arraySort(floatArr);
            System.out.println("The sorted values are: ");
            System.out.print(floatArr[0]);
            for(int i = 1; i < 8; i++){
                System.out.print(", " + floatArr[i]);
            }

        }
    }
    public static void arraySort(int[] arr){
        for(int i = 0; i < arr.length - 1; i++){
            for(int j = 0; j < arr.length - i - 1; j++){
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    public static void arraySort(char[] arr){
        for(int i = 0; i < arr.length - 1; i++){
            for(int j = 0; j < arr.length - i - 1; j++){
                if(arr[j] > arr[j + 1]){
                    char temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    public static void arraySort(float[] arr){
        for(int i = 0; i < arr.length - 1; i++){
            for(int j = 0; j < arr.length - i - 1; j++){
                if(arr[j] > arr[j + 1]){
                    float temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
