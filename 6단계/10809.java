import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        String a = s.next();
        int arr[] = new int[26];
        for(int i=0; i<26; i++)
            arr[i]=-1;
        for(int i=0; i<a.length(); i++){
            char c = a.charAt(i);
            if(arr[c-'a']==-1)
                arr[c-'a']=i;
        }
        for(int i=0; i<26; i++)
            System.out.print(arr[i] + " ");
    }
}
