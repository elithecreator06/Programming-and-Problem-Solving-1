/*
Class: CSE 1321L
Section: WJ3
Term: Spring 2024
Instructor: Eun Sik Kim
Name:Emmanuel Durojaiye
Assignment#: 4B
*/

import java.util.Scanner;
import java.util.Random;
public class Assignment4B {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int correct = 0;
        int incorrect = 0;
        System.out.println("[Mathletes Game]");
        System.out.print("Choose a game mode (0=Easy, 1=Hard): ");
        int mode = sc.nextInt();
        if(mode == 0){
            System.out.println("Playing on easy mode, huh? Okay!");
                for(int i = 0; i < 4; i++){
                    int num = rand.nextInt(-255, 255);
                    int num2 = rand.nextInt(-255, 255);
                    System.out.println("Q" + (i +1) + ". " + num + " * " + num2 + " = ?");

                    int answer = sc.nextInt();
                    int compAnswer = num * num2;
                    if(answer == compAnswer){
                        System.out.println("Correct!");
                        correct++;
                    }else{
                        System.out.println("Incorrect! Try again.");
                        incorrect++;
                        answer = sc.nextInt();
                        if(answer == compAnswer) {
                            System.out.println("Correct!");
                            correct++;
                        }
                    }
                    if(correct == 3){
                        System.out.println("You win!");
                        break;
                    }else if(incorrect == 2) {
                        System.out.println("Game over...");
                        break;
                    }
                }
        }else if(mode == 1){
            System.out.println("So, you want a challenge? Okay!");
            for(int i = 0; i < 6; i++){
                int num = rand.nextInt(-255, 255);
                int num2 = rand.nextInt(-255, 255);
                System.out.println("Q" + (i + 1) + ". " + num +  " * " + num2 + " = ?");
                int answer = sc.nextInt();
                int compAnswer = num * num2;
                if(answer == compAnswer){
                    System.out.println("Correct!");
                    correct ++;
                }else{
                    System.out.println("Incorrect!");
                    incorrect ++;
                }
                if(correct == 6){
                    System.out.println("You win!");
                    break;
                }else if(incorrect == 1){
                    System.out.println("Game over...");
                    break;
                }
            }
        }
    }
}
