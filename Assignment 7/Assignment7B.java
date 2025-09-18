/*
Class: CSE 1321L
Section: WJ3
Term: Spring 2024
Instructor: Eun Sik Kim
Name: Emmanuel Durojaiye
Assignment#: 7B
*/

import java.util.Scanner;
public class Assignment7B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("[Portable Pix Map Art Program]");
        System.out.print("Enter an image width: ");
        int width = sc.nextInt();
        System.out.print("Enter an image height: ");
        int height = sc.nextInt();

        Pixel[][] image = new Pixel[height][width];
        Pixel pix = new Pixel();

        System.out.print("Enter the fill color's red value: ");
        int fillRed = sc.nextInt();
        if(fillRed > 255){
            System.out.print("Invalid color");
            fillRed = pix.red;
        }
        System.out.print("Enter the fill color's green value: ");
        int fillGreen = sc.nextInt();
        if(fillGreen > 255){
            System.out.print("Invalid color");
            fillGreen = pix.red;
        }
        System.out.print("Enter the fill color's blue value: ");
        int fillBlue = sc.nextInt();
        if(fillBlue > 255){
            System.out.print("Invalid color");
            fillBlue = pix.red;
        }



        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                image[i][j] = new Pixel(fillRed, fillGreen, fillBlue);
            }
        }

        int choice = 0;
        while(choice != 4){
            System.out.print("""
                    
                    What will you do?
                    1) Fill in a pixel
                    2) Fill in a line
                    3) Print the image
                    4) Quit
                    """);
            System.out.print("Choice? ");
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.print("\nRow: ");
                    int row = sc.nextInt();
                    System.out.print("Column: ");
                    int col = sc.nextInt();
                    System.out.print("New Red Color: ");
                    int newRed = sc.nextInt();
                    System.out.print("New Green Color: ");
                    int newGreen = sc.nextInt();
                    System.out.print("New Blue Color: ");
                    int newBlue = sc.nextInt();

                    if (row >= 0 && row < height && col >= 0 && col < width) {
                        image[row][col].changeRGB(newRed, newGreen, newBlue);
                    }
                }
                case 2 -> {
                    System.out.print("\nRow: ");
                    int row2 = sc.nextInt();
                    System.out.print("Column: ");
                    int col2 = sc.nextInt();
                    System.out.print("Length: ");
                    int length = sc.nextInt();
                    System.out.print("New Red Color: ");
                    int newRed2 = sc.nextInt();
                    System.out.print("New Green Color: ");
                    int newGreen2 = sc.nextInt();
                    System.out.print("New Blue Color: ");
                    int newBlue2 = sc.nextInt();

                    int endCol;

                    endCol = Math.min(col2 + length, image[0].length - 1);

                    for(int row = row2; row <= row2; row++){
                        for(int col = col2; col <= endCol; col++){
                            if(row < image.length && col < image[0].length){
                                image[row][col].changeRGB(newRed2, newGreen2, newBlue2);
                            }
                        }
                    }
                }
                case 3 -> {
                    System.out.println("\nP3");
                    System.out.println(width + " " + height);
                    System.out.println("255");
                    for (int i = 0; i < height; i++) {
                        for (int j = 0; j < width; j++) {
                            image[i][j].printRGB();
                        }
                        System.out.println();
                    }
                }
                case 4 -> {
                    System.out.println("\nP3");
                    System.out.println(width + " " + height);
                    System.out.println("255");
                    for (int i = 0; i < height; i++) {
                        for (int j = 0; j < width; j++) {
                            image[i][j].printRGB();
                        }
                        System.out.println();
                    }
                    System.out.println("Closing...");
                }
            }
        }
    }


    public static class Pixel{
        private int red;
        private int green;
        private int blue;

        public Pixel(){
            red = 255;
            green = 255;
            blue = 255;
        }

        public Pixel(int r, int g, int b) {
            red = r;
            green = g;
            blue = b;
        }

        public void changeRGB(int r, int g, int b) {
            red = r;
            green = g;
            blue = b;
        }

        public void printRGB() {
            System.out.print(red + " " + green + " " + blue + " ");
        }
    }
}