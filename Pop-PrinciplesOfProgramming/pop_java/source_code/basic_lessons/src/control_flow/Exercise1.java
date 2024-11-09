package control_flow;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your Mark: ");
        int mark = scanner.nextInt();

        if (mark >= 0 && mark < 40) {
            System.out.println("Fail");
        } else if (mark >= 40 && mark <= 59) {
            System.out.println("Pass");
        } else if (mark >= 60 && mark <= 79) {
            System.out.println("Merit");
        } else if (mark >= 80 && mark <= 100) {
            System.out.println("Distinction");
        } else {
            System.out.println("Invalid mark");
        }

        scanner.close();
    }
}
