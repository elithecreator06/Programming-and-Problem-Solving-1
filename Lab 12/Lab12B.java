/*
Class: CSE 1321L
Section: WJ3
Term: Spring 2024
Instructor: Eun Sik Kim
Name: Emmanuel Durojaiye
Lab#: 12B
*/

import java.util.Scanner;
public class Lab12B {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int age;
        double weigh;
        String name;
        String color;
        String breed;
        double moreFood;
        String renamed;

        System.out.println("You are about to create a dog");
        System.out.print("How old is the dog: ");
        age = sc.nextInt();
        System.out.print("How much does the dog weigh: ");
        weigh = sc.nextDouble();
        System.out.print("What is the dog's name: ");
        name = sc.next();
        System.out.print("What color is the dog: ");
        color = sc.next();
        System.out.print("What breed is the dog: ");
        breed = sc.next();

        Dog yourDog = new Dog(age, weigh, name, color, breed);

        System.out.println("\n" + yourDog.name + " is a " + yourDog.age + " year old " + yourDog.furColor + " " + yourDog.breed + " that weighs " + yourDog.weight + " lbs.");

        yourDog.bark();
        System.out.print(yourDog.name + " is hungry, how much should he eat: ");
        moreFood = sc.nextDouble();
        System.out.print(yourDog.name + " isn't a very good name. What should they be renamed to: ");
        renamed = sc.next();

        System.out.print("\n" + yourDog.rename(renamed) + " is a " + yourDog.age + " year old " + yourDog.furColor + " " + yourDog.breed + " that weighs " + yourDog.eat(weigh,moreFood) + " lbs.");

    }


    public static class Dog{
        public int age;
        public double weight;
        public String name;
        public String furColor;
        public String breed;
        Dog(int a, double w, String n, String fC, String b){
            age = a;
            weight = w;
            name = n;
            furColor = fC;
            breed = b;
        }

        public void bark(){
            System.out.println("\nWoof! Woof!");
        }

        public String rename(String name){
            return name;
        }

        public double eat(double weight, double moreFood){
            double needEat;
            needEat = (weight + moreFood);
            return needEat;
        }
    }
}
