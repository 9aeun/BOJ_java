import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        
        for(int i=N; i>0; i--){
            for(int j=1; j<=N; j++){
                if(j>=i) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
