package control_flow;

import java.util.Scanner;

public class lesson7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = in.nextInt();

        System.out.print("Enter second number: ");
        int num2 = in.nextInt();

        System.out.print("Addition answer is "+(num1 + num2));
        in.close();
    }
}
