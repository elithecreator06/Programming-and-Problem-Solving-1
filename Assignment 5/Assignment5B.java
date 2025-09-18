/*
Class: CSE 1321L
Section: WJ3
Term: Spring 2024
Instructor: Eun Sik Kim
Name:Emmanuel Durojaiye
Assignment#: 5B
*/

import java.util.Scanner;
public class Assignment5B {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int choice, length = 0;

        System.out.println("[FYE Level Map Creator]");
        System.out.print("Enter a level map width: ");
        int width = sc.nextInt();
        System.out.print("Enter a level map height: ");
        int height = sc.nextInt();
        String[][] map = new String[width][height];

        for(int i = 0; i < height; i++){
            for(int j = 0; j < width; j++){
                map[j][i] = "_";
                System.out.print(map[j][i]);
            }
            if(i == height - 1){
                break;
            }
            System.out.println();
        }

        do{
            System.out.print("""
                    \n
                    Options
                    1. Clear Level
                    2. Add Platform
                    3. Add Items
                    4. Quit
                    """);
            System.out.print("Enter a choice: ");
            choice = sc.nextInt();

            if(choice == 1){
                System.out.println();
                System.out.println("[Clear Level]");
                for(int i = 0; i < height; i++){
                    for(int j = 0; j < width; j++){
                        map[j][i] = "_";
                        System.out.print(map[j][i]);
                    }
                    if(i == height - 1){
                        break;
                    }
                    System.out.println();
                }
            }else if(choice == 2){
                System.out.println();
                System.out.println("[Add Platform]");
                System.out.print("Enter X Coordinate: ");
                int x = sc.nextInt();
                System.out.print("Enter Y Coordinate: ");
                int y = sc.nextInt();
                if( x >= width || y >= height){
                    System.out.println("This is not a valid location!");
                }else{
                    System.out.print("Enter Length: ");
                    length = sc.nextInt();
                }
                if(length > width - x){
                    System.out.println("This platform won't fit in the level!");
                    for(int i = 0; i < height; i++){
                        for (int j = 0; j < width; j++) {
                            System.out.print(map[j][i]);
                        }
                        System.out.println();
                    }
                    continue;
                }
                for(int k = 0; k < length; k++){
                    map[x][y] = "=";
                    x++;
                }
                for(int i = 0; i < height; i++) {
                    for (int j = 0; j < width; j++) {
                        System.out.print(map[j][i]);
                    }
                    System.out.println();
                }
            }else if(choice == 3){
                System.out.println();
                System.out.println("[Add Item]");
                System.out.print("Enter X Coordinate: ");
                int x = sc.nextInt();
                System.out.print("Enter Y Coordinate: ");
                int y = sc.nextInt();
                if(x >= width || y >= height){
                    System.out.println("This is not a valid location!");
                }else{
                    map[x][y] = "P";
                }
                for(int i = 0; i < height; i++) {
                    for (int j = 0; j < width; j++) {
                        System.out.print(map[j][i]);
                    }
                    System.out.println();
                }
            }else if(choice == 4){
                System.out.println();
                for(int i = 0; i < height; i++) {
                    for (int j = 0; j < width; j++) {
                        System.out.print(map[j][i]);
                    }
                    System.out.println();
                }
                System.out.print("Goodbye!");
            }
        }while(choice != 4);
    }
}
