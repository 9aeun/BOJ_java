import java.util.*;
public class Main{
  
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int[] num = new int[31];
    Arrays.fill(num, 0);
    for(int i=0; i<28; i++){
      int a = sc.nextInt();
      num[a] = a;
    }    
    for(int i=1; i<31; i++){
      if(num[i] == 0)
        System.out.println(i);
    }
  }
}
