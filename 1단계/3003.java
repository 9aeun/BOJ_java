import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int[] chess = {1,1,2,2,2,8};
    int[] n = new int[6];
    int[] an = new int[6];
    
    for(int i=0; i<6; i++){
      n[i]=input.nextInt();
      an[i] = chess[i]-n[i];
      System.out.print(an[i] + " ");
    }
  }
}
