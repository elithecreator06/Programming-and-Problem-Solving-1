/*
Class: CSE 1321L
Section: WJ3
Term: Spring 2024
Instructor: Eun Sik Kim
Name: Emmanuel Durojaiye
Assignment#: 7A
*/

import java.util.Scanner;
public class Assignment7A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Scanner scan = new Scanner(System.in);
        System.out.println("[Finite State Automata]");
        System.out.print("What state do you want to start at? ");
        int state = sc.nextInt();
        FSA fsa = new FSA(state);
        while(true){
            System.out.println("""

                    What will you do?\s
                    >Go to next state
                    >End""");
            String opt = scan.nextLine();
            if(opt.equalsIgnoreCase("Go to next state")){
                System.out.println("\nYou're now at state " + fsa.goToNextState() + ". ");
            }else if(opt.equalsIgnoreCase("End")){
                if(fsa.end()){
                    System.out.println("\nThe FSA has shut down.");
                    break;
                }else{
                    System.out.println("\nYou can't stop here; you can only stop at state 3.");
                }
            }else{
                System.out.println("\n[Invalid command!]");
            }
        }
    }


    public static class FSA{
        private int state;

        public FSA(int state){
            if(state >= 0 && state <= 3){
                this.state = state;
            }else{
                System.out.print("This is an invalid state, starting at state 0");
                this.state = 0;
            }
        }

        public int goToNextState(){
            if(state == 3){
                state = 0;
            }else{
                state++;
            }

            return state;
        }

        public boolean end(){
            return state == 3;
        }
    }
}
