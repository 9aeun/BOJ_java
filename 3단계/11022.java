import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int T = s.nextInt();
        int arr[] = new int[T];
        for(int i=0; i<T; i++){
            int A = s.nextInt();
            int B = s.nextInt();
            arr[i] = A+B;
            System.out.print("Case #"+ (i+1) +": ");
            System.out.println(A + " + " + B + " = " + arr[i]);
        }     
    }
}
