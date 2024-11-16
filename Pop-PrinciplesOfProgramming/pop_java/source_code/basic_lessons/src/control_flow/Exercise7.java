package control_flow;

import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        String userChoice;

        do {
            System.out.println("Enter a number: ");
            number = scanner.nextInt();

            if (number % 2 == 0) {
                System.out.println("Yes");
            }

            // Ask if the user wants to continue
            System.out.println("Do you want to continue? (yes/no): ");
            userChoice = scanner.next();

        } while (userChoice.equalsIgnoreCase("yes")); // Continue if the user says "yes"

        System.out.println("Program exited.");
    }
}
