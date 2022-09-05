import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int A = s.nextInt();
        int B = s.nextInt();
        int b1 = B%100%10;
        int b2 = B%100/10;
        int b3 = B/100;
        
        System.out.println(A*b1);
        System.out.println(A*b2);
        System.out.println(A*b3);
        System.out.println(A*B);
    }
}
