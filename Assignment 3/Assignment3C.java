/*
Class: CSE 1321L
Section: 3
Term: Spring 2024
Instructor: Eun Sik Kim
Name:Emmanuel Durojaiye
Assignment#: 3
*/
import java.util.Scanner;
public class Assignment3C {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("[Epic Quest Simulator]");
        System.out.println("""
                Hello stranger! Do you have time to hear my tale?
                1) Yes
                2) No\s""");
        int yesOrNo = sc.nextInt();
        if(yesOrNo ==  1){
            System.out.print("""
                    Thank you! I come from the land of Pax Bisonica. Our country has been taken over by a cruel tyrant!
                    1) That’s awful!
                    2) What can I do?
                    """);
            int awfulOrToDo = sc.nextInt();
            if(awfulOrToDo == 1){
                System.out.print("""
                        Alas, it is truly terrible...
                        Please, you must journey to Pax Bisonica and free our country!
                        1) Yes
                        2) No""");
                int yesNo = sc.nextInt();
                if(yesNo == 1){
                    System.out.print("Hooray!");
                }else if(yesNo == 2){
                    System.out.print("Then all is lost...");
                }
            }else if(awfulOrToDo == 2){
                System.out.print("""
                        Please, you must journey to Pax Bisonica and free our country!
                        1) Yes
                        2) No
                        """);
                int yesNo = sc.nextInt();
                if(yesNo == 1){
                    System.out.print("Hooray!");
                }else if(yesNo == 2){
                    System.out.print("Then all is lost...");
                }
            }
        }else if(yesOrNo == 2){
            System.out.print("Ah, then goodbye...");
        }

    }
}
