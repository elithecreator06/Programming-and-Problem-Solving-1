/*
Class: CSE 1321L
Section: 3
Term: Spring 2024
Instructor: Eun Sik Kim
Name:Emmanuel Durojaiye
Assignment#: 3
*/
import java.util.Scanner;
public class Assignment3B {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("[Image Encoding Checker]");
        System.out.print("What is the image width? ");
        int width = sc.nextInt();
        System.out.print("What is the image height? ");
        int height = sc.nextInt();
        System.out.print("What is the file size (in bytes)? ");
        int fileSize = sc.nextInt();

        if(width <= 0 || height <= 0 || fileSize <= 0){
            System.out.println("\nThe information is invalid – please re-enter it.");
        }else{
            int BPC = (fileSize * 8) / (width * height * 4);
            switch (BPC) {
                case 8 -> System.out.println("\nThe RGBA image is encoded with 8 bits per channel.");
                case 16 -> System.out.println("\nThe RGB image is encoded with 16 bits per channel.");
                case 32 -> System.out.println("\nThe RGB image is encoded with 32 bits per channel.");
                default -> System.out.println("\nYour computer does not know how to read this encoding");
            }
        }







    }
}
