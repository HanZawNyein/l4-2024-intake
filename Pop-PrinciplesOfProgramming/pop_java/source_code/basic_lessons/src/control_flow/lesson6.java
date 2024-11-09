package control_flow;

import java.util.Scanner;
//        Scanner

public class lesson6 {
    public static void main(String[] args) {
        System.out.println("Enter your name : ");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println("Your name is "+name);
        sc.close();
    }
}

//object creation
//class_name bj_name=new constructor();
//Scanner sc = new Scanner(System.in);