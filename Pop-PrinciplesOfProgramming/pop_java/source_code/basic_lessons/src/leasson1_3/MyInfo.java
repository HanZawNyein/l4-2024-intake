package leasson1_3;

import java.util.Scanner;

public class MyInfo {

    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);

        //input name from user
        System.out.println("What's your name?");
        String name = in.nextLine();

        System.out.println("How old are you?");
        byte age = in.nextByte();
        in.nextLine();

        System.out.println("What's your address?");
        String addr = in.nextLine();

        System.out.println("Tell me your phone number!");
        String ph = in.nextLine();

        System.out.println("This is your information");
        System.out.println("------------------------------");
        System.out.println("Your name is " + name);
        System.out.println("You are " + age + " years old");
        System.out.println("You live in " + addr);
        System.out.println("Your ph number is " + ph);

        in.close();
    }
}
