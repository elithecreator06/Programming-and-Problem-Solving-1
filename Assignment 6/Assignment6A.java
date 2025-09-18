/*
Class: CSE 1321L
Section: WJ3
Term: Spring 2024
Instructor: Eun Sik Kim
Name: Emmanuel Durojaiye
Assignment#: 6A
*/

import java.util.Random;
public class Assignment6A {
    public static void main(String[] args) {
        Random rc = new Random();
        System.out.println("[Bogosort]\n");
        int[] arr = new int[19];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rc.nextInt(1, 453);
        }
        printArray(arr);
        int count = 0;
        while(!check_if_sorted(arr)){
            arr = shuffleArray(arr);
            printArray(arr);
            count++;
        }
        System.out.print("And it only took " + count + " attempts!");
    }

    public static boolean check_if_sorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static int[] shuffleArray(int[] arr) {
        int[] shuffleArr = new int[arr.length];
        Random rc = new Random();
        boolean[] used = new boolean[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int randIndex;
            do {
                randIndex = rc.nextInt(arr.length);
            } while (used[randIndex]);
            shuffleArr[i] = arr[randIndex];
            used[randIndex] = true;
        }
        return shuffleArr;
    }


    public static void printArray(int[] arr) {
        System.out.println("Printing array...");
        for (int i : arr) {
            System.out.print(i + ", ");
        }
        if(check_if_sorted(arr)){
            System.out.print("\nHooray, it’s sorted! ");
        }else{
            System.out.println("\nNot sorted yet!\n");
            System.out.println("Shuffling array...\n");
        }
    }
}
