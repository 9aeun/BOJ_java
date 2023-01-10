import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int arr[] = new int[9];
        for(int i=0; i<9; i++)
            arr[i] = s.nextInt();
        int max=arr[0];
        int j=0;
        int count=0;
        while(j<9){
            if(arr[j]>max){
                max=arr[j];
                count=j;
            }  
            j++;
        }
        System.out.println(max);
        System.out.println(count+1);
    }
}
