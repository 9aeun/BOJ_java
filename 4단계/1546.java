import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        double arr[] = new double[N];
        for(int i=0; i<N; i++)
            arr[i]=s.nextDouble();
        Arrays.sort(arr);
        double sum=0;
        for(int i=0; i<N; i++){
            sum+=(arr[i]/arr[N-1])*100;
        }
        System.out.println(sum/N);
    }
}
