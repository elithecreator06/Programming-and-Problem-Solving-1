/*
Class: CSE 1321L
Section: WJ3
Term: Spring 2024
Instructor: Eun Sik Kim
Name: Emmanuel Durojaiye
Assignment#: 6C
*/

import java.util.Scanner;
import java.util.Random;
public class Assignment6C {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random rc = new Random();

        int count = 0;

        System.out.println("[Minesweeper – DOS Edition]");
        System.out.print("What is the grid size? ");
        int size = sc.nextInt();
        char[][] grid = new char[size][size];
        int[] lost = new int[size];
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                grid[j][i] = '?';
                System.out.print(grid[j][i]);
            }
            System.out.println();
        }
        for(int k = 0; k < grid.length; k++){
            int l = rc.nextInt(size);
            lost[k] = l;
            System.out.print("Enter your X coordinate: ");
            int x = sc.nextInt();
            System.out.print("Enter your Y coordinate: ");
            int y = sc.nextInt();
            if(x == k && y == l){
                grid[x][y] = 'X';
                for(int i = 0; i < size; i++){
                    for(int j = 0; j < size; j++){
                        System.out.print(grid[j][i]);
                    }
                    System.out.println();
                }
                System.out.println("Sorry, you hit a mine!");
                System.out.print("Game Over!");
                break;
            }else if(y != k || x != l){
                count++;
                grid[x][y] = '_';
                for(int i = 0; i < size; i++){
                    for(int j = 0; j < size; j++){
                        System.out.print(grid[j][i]);
                    }
                    System.out.println();
                }
                if((grid.length) == count){
                    System.out.println("You win!");
                    break;
                }
            }
        }
    }
}
