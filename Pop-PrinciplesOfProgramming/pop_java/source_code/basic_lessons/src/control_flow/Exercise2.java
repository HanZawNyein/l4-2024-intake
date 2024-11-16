package control_flow;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        System.out.print("Enter a Number: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        // Check if the number is even or odd
        if (number % 2 == 0) {
            System.out.println("The number " + number + " is even.");
        } else {
            System.out.println("The number " + number + " is odd.");
        }

        sc.close();
    }
}
