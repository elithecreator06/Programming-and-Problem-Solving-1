/*
Class: CSE 1321L
Section: WJ3
Term: Spring 2024
Instructor: Eun Sik Kim
Name:Emmanuel Durojaiye
Lab#: 8B
*/

import java.util.Scanner;
public class Lab8B {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int rows;
        int columns;
        int spaces = 1;

        System.out.print("Please enter the number of rows: ");
        rows = scan.nextInt();
        System.out.print("Please enter the number of columns: ");
        columns = scan.nextInt();

        int[][] rc1 = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                rc1[i][j] = spaces++;
            }
        }
        System.out.println("\nI have " + rows + " rows and " + columns + " columns. I need to fill-up " + rows * columns + " spaces.");

        System.out.println("\nThe " + rows + "x" + columns + " array:");
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                System.out.print(rc1[i][j] + " | ");
            }
            System.out.println();
        }
    }
}
