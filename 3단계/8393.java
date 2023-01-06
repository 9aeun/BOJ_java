import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int A = s.nextInt();
        
        int sum=0;
        for(int i=1; i<=A; i++)
            sum+=i;
        
        System.out.println(sum);
    }
}
