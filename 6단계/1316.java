import java.util.*;
public class Main{
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[]){
        int n=sc.nextInt();
        int count=0;
        
        for(int i=0; i<n; i++){
            if(checker()==true)
                count++;
        }
        System.out.println(count);
    }
    
    public static boolean checker(){
        boolean check[] = new boolean[26];
        int a = 0;
        String s = sc.next();
        int p=0;
        for(int i=0; i<s.length(); i++){
            int n = s.charAt(i);
            if(p!=n){
                if(check[n-'a']==false){
                    check[n-'a']=true;
                    p=n;
                }
                else
                    return false;
            }
            else
                continue;
        }
        return true;
    }
}
