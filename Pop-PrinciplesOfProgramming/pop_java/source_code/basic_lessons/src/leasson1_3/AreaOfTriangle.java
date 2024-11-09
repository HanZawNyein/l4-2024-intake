package leasson1_3;

import java.text.DecimalFormat;
import java.util.Scanner;


public class AreaOfTriangle {
    
    public static void main(String args[]){
        
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter base of triangle");
        double base=sc.nextDouble();
        
        System.out.println("Enter height of triangle");
        double height=sc.nextDouble();
        
        double area=(base*height)/2;
        
        DecimalFormat format=new DecimalFormat("###.##");
        
        System.out.println("Area of Triangle is "+format.format(area));
        sc.close();
        
    }
    
}
