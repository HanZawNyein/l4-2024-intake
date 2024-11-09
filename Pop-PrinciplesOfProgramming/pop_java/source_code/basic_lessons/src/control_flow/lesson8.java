package control_flow;

import java.util.Scanner;

public class lesson8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Item ID : ");
        String itemID = scan.nextLine();

        System.out.println("Enter Item Price : ");
        double price = scan.nextDouble();
        System.out.println("Price of Item : "+itemID+" is $"+price);

        scan.close();
    }
}
