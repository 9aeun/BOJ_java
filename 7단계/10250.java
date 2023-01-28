import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] guest = new int[n];
    for(int i=0; i<n; i++){
      int H = sc.nextInt();
      int W = sc.nextInt();
      int N = sc.nextInt();

      if(N%H == 0)
        guest[i] = (H*100)+(N/H);
      else
        guest[i] = ((N%H)*100)+((N/H)+1);
      
    }
    for(int i=0; i<n; i++){
      System.out.println(guest[i]);
    }
  }
}
