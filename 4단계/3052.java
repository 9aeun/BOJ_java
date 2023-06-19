import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int arr[] = new int[10];
        boolean b;
        int count=0;
        for(int i=0; i<10; i++){
            arr[i]=s.nextInt()%42;
        }   
        
        for(int i=0; i<10; i++){
            b=false;
            for(int j=i+1; j<10; j++){
                if(arr[i]==arr[j]){
                    b=true;
                    break;
                }
            }
            if(b==false)
                count++;
        }
        System.out.println(count);
    }
}
