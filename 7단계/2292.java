import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a = 1;
        int b = 2;
        if(n==1)
            System.out.println(1);
        else{
            while(b<=n){
                b+=(6*a);
                a++;
            }
            System.out.println(a);
        }
    }
}
