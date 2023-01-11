import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int C=s.nextInt();
        int arr[];
        for(int i=0; i<C; i++){
            int N = s.nextInt();
            arr=new int[N];
            
            double sum=0;
            
            for(int j=0; j<N; j++){
                int a = s.nextInt();
                arr[j]=a;
                sum+=a;
            }
            double mean=(sum/N);
            double count=0;
            
            for(int j=0; j<N; j++){
                if(arr[j]>mean)
                    count++;
            }
            System.out.printf("%.3f%%\n",(count/N)*100);
        }
    }
}
