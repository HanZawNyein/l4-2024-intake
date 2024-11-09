package control_flow;

import java.util.Scanner;


//int arr[] = {10,20,30};

public class lesson10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Year Number : ");
        int year = sc.nextInt();

        System.out.println("Enter Month Number : ");
        int month = sc.nextInt();

//        System.out.println("Enter Day Number : ");
//        int days = sc.nextInt();
        int days = 0;

        String monthName[] = {
                "January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November","December"};
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                days = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                days = 30;
                break;
            case 2:
                if (((year % 4 == 0) && !(year % 100 == 0)) || (year % 400 == 0)) {
                    days = 29;
                } else {
                    days = 28;
                }
                break;
                default:
                    System.out.println("Invalid Month Number");
                    break;
        }
        System.out.println("Year : " + year+" "+monthName[month-1]+" has "+days+" days.");
    }
}
