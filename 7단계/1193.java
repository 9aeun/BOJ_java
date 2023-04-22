import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a = 1;
        int b = 0;
        
        while(true){
            if(n<=a+b){
                if(a%2==1){
                    System.out.print((a-(n-b-1)) + "/" + (n-b));
                    break;
                }
                else{
                    System.out.print((n-b)+"/"+(a-(n-b-1)));
                    break;
                }
            }
            else{
                b+=a;
                a++;
            }
        }
    }
}
