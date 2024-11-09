package leasson1_3;

//increment operator ++
//decrement operator --
public class UnaryOperator {
    
    public static void main(String args[]){
        int x=10;
        System.out.println(++x + ++x);
        System.out.println(x++);
        System.out.println(x);
        
        int a=2, b=3, c=0;
        c=a+b;
        
        c=c+10;
        c+=10;
    }
    
}

//pre increment ++x
//post increment x++
//pre decrement --x
//post decrement x--
