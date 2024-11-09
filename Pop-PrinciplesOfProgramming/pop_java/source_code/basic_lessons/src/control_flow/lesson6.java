package control_flow;

import java.util.Scanner;

// Scanner Lessons

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

/*
nextInt()	    Int	It takes int type input value from the user.
nextFloat()	    Float	It takes a float type input value from the user.
nextBoolean()	Boolean	It takes a boolean type input value from the user.
nextLine()	    String	It takes a line as an input value from the user.
next()	        String	It takes a word as an input value from the user.
nextByte()	    Byte	It takes a byte type of input value from the user.
nextDouble()	Double	It takes a double type input value from the user.
nextShort()	    Short	It takes a short type input value from the user.
nextLong()	    Long	It takes a long type of input value from the user.
*/