import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int arr[] = new int[26];
        for(int i=0; i<s.length(); i++){
            if(65<=s.charAt(i) && s.charAt(i)<=90){
                arr[s.charAt(i)-65]++;
            }
            else{
                arr[s.charAt(i)-97]++;
            }
        }
        int max=-1;
        char c = '?';
        for(int i=0; i<26; i++){
            if(arr[i]>max){
                max=arr[i];
                c=(char)(i+65);
            }
            else if(arr[i]==max){
                c='?';
            }
        }
        System.out.println(c);
    }
}
