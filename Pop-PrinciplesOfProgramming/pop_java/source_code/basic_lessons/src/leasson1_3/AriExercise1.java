package leasson1_3;

import java.util.Scanner;


public class AriExercise1 {
    
    public static void main(String args[]){
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter minutes value: ");
        int input=sc.nextInt();
        
        int hours=input/60;
        int minutes=input%60;
        System.out.println(hours+" hours and "+minutes+" minutes");
    }
    
}