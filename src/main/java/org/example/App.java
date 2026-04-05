package org.example;
public class App {

    public static void main(String[] args) {

        // Default case
        if (args.length == 0) {
            System.out.println("Hello, World!");
            return;
        }

        StringBuilder nameBuilder = new StringBuilder();
        boolean first = true;

        // Enhanced for loop
        for (String name : args) {

            name = name.trim();

            // Skip empty inputs
            if (name.isEmpty()) continue;

            if (!first) {
                nameBuilder.append(", ");
            }

            nameBuilder.append(name);
            first = false;
        }

        // Handle case where all inputs were empty
        if (nameBuilder.length() == 0) {
            System.out.println("Hello, World!");
        } else {
            System.out.println("Hello, " + nameBuilder.toString() + "!");
        }
    }
}