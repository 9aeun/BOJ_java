import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int[][] APT = new int[15][15];

    for(int i=0; i<15; i++){
      APT[i][1] = 1;
      APT[0][i] = i;
    }

    for(int i=1; i<15; i++){
      for(int j=2; j<15; j++){
        APT[i][j]=APT[i][j-1]+APT[i-1][j];
      }
    }

    int n = sc.nextInt();
    int[] answer = new int[n];

    for(int i=0; i<n; i++){
      int a = sc.nextInt();
      int b = sc.nextInt();
      answer[i] = APT[a][b];
    }

    for(int i=0; i<n; i++){
      System.out.println(answer[i]);
    }
  }
}
