import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int A = s.nextInt();
        int B = s.nextInt();
        int C = s.nextInt();
        
        int h = C/60;
        int m = C%60;
        
        if((B+m)>=60){
            A=A+1+h;
            B=B+m-60;
        }
        else{
            A=A+h;
            B=B+m;
        }
        if(A>=24){
            A-=24;
        }
        System.out.println(A + " " + B);
    }
}
