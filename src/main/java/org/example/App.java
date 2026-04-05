package org.example;
public class App{


    public static void main(String[] args) {

        // UC1: Hello World (default)
        if (args.length == 0) {
            System.out.println("Hello, User!");
        }
        // UC2: Personalized Greeting
        else {
            String name = args[0];
            System.out.println("Hello, " + name + "!");
        }
    }
}