package control_flow;

public class Exercise3 {
    public static void main(String[] args) {
        for (int row = 1; row <= 5; row++) {
            for (int col = 1; col <= 5; col++) {
                System.out.print("*"); // Print stars on the same line
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
//
//*
//**
//***
//****
//*****