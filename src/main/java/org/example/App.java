package org.example;
public class App {

    public static void main(String[] args) {

        // If no names provided → default
        if (args.length == 0) {
            System.out.println("Hello, World!");
            return;
        }

        // Build names string
        StringBuilder nameBuilder = new StringBuilder();

        for (int i = 0; i < args.length; i++) {
            String name = args[i].trim();

            // Skip empty inputs
            if (name.isEmpty()) continue;

            nameBuilder.append(name);

            // Add comma only between names
            if (i < args.length - 1) {
                nameBuilder.append(", ");
            }
        }

        System.out.println("Hello, " + nameBuilder.toString() + "!");
    }
}