package org.example;
public class App {

    public static void main(String[] args) {

        // Default case
        if (args.length == 0) {
            System.out.println("Hello, World!");
            return;
        }

        StringBuilder nameBuilder = new StringBuilder();

        // Build string with delimiter
        for (String name : args) {
            name = name.trim();

            if (!name.isEmpty()) {
                nameBuilder.append(name).append(", ");
            }
        }

        // If no valid names
        if (nameBuilder.length() == 0) {
            System.out.println("Hello, World!");
            return;
        }

        // Remove trailing ", "
        String finalNames = nameBuilder.substring(0, nameBuilder.length() - 2);

        System.out.println("Hello, " + finalNames + "!");
    }
}