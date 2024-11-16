package control_flow;

import java.util.Scanner;

public class lesson12 {
    public static void main(String[] args) {
        System.out.println("Enter A Numer : ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        for (int i = 1; i <= 13; i++) {
            System.out.println(number + "x" + i + "=" + (number * i));
        }
        sc.close();
    }
}
