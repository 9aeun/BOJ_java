import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int A = s.nextInt();
        int B = s.nextInt();
        int C = s.nextInt();
        int price=0;
        
        if(A==B && B==C)
            price = 10000+A*1000;    
        else if(A==B | B==C)
            price = 1000+B*100;
        else if(A==C)
            price = 1000+A*100;
        else if(A!=B&& B!=C &&A!=C){
            if(A>B && A>C)
                price = A*100;
            else if(B>A && B>C)
                price = B*100;
            else if(C>A && C>B)
                price = C*100;
        }
        System.out.println(price);
    }
}
