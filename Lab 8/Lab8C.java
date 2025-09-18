/*
Class: CSE 1321L
Section: WJ3
Term: Spring 2024
Instructor: Eun Sik Kim
Name:Emmanuel Durojaiye
Lab#: 8C
*/

import java.util.Scanner;
public class Lab8C {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        int rows, columns;
        int oneD = 1, twoD = 1;

        System.out.print("Please enter the number of rows: ");
        rows = scan.nextInt();
        System.out.print("Please enter the number of columns: ");
        columns = scan.nextInt();

        int[][] rc2D = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                rc2D[i][j] = twoD++;
            }
        }
        System.out.println("\nI have " + rows + " rows and " + columns + " columns. I need to fill-up " + rows * columns + " spaces.");

        System.out.println("\nThe " + rows + "x" + columns + " array:");
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                System.out.print(rc2D[i][j] + " | ");
            }
            System.out.println();
        }

        System.out.println("\nThe " + rows + "x" + columns + " 2-D array flattened into a " + rows * columns + " cell 1-D array:");
        int[] rc1D = new int[rows * columns];
        for(int i = 0; i < rc1D.length; i++){
            rc1D[i] = oneD++;
            System.out.print(rc1D[i] + " | ");
        }
    }
}
