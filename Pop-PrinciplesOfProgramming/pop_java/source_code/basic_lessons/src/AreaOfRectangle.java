
import java.util.Scanner;


public class AreaOfRectangle {
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the width of Rec");
        int width=sc.nextInt();
        System.out.println("Enter the height of Rec");
        int height=sc.nextInt();
        
        int area=width*height;
        
        System.out.println("Area of Rec is "+area);
    }
}