package control_flow;

public class Exercise3 {
    public static void main(String[] args) {
        boolean control = true;
        for (int i = 3; i <= 100; i++) {
            control = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    control=false;
                    break;
                }
            }
            if(control){
                System.out.println(i+" is prime number.");
            }
        }
    }
}
