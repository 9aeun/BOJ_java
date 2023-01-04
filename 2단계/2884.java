import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int H = s.nextInt();
        int M = s.nextInt();
        
        if(M<45){
            if(H==0){
                H=23;
                M=M+60-45;
            }
            else{
                H-=1;
                M=M+60-45;
            }
        }
        else{
            M-=45;
        }
        System.out.println(H + " " + M);
        
    }
}
