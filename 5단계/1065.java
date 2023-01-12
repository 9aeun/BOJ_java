import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        System.out.println(hansu(N));
    }
    public static int hansu(int n){
        int count=0;
        if(n<100)
            return n;
        else{
            count=99;
            for(int i=100; i<=n; i++){
                int h=i/100;
                int t=(i/10)%10;
                int o=i%10;
                if((h-t)==(t-o))
                    count++;
            }
        }
        return count;
    }
}
