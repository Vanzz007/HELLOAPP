package org.example;
public class App {


    public static void main(String[] args) {

        // Default value (UC3)
        String name = "World";

        // UC2: Check if user provided input
        if (args.length > 0 && args[0] != null && !args[0].trim().isEmpty()) {
            name = args[0].trim();
        }

        // Output (UC1 + UC2 + UC3)
        System.out.println("Hello, " + name + "!");
    }
}