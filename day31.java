import java.util.Scanner;

public class day31 {
  public static void main(String[] args) {
    System.out.println();
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int pre = 0;
    int cur = 1;
    System.out.print("0 1 ");
    for(int i=2;i<n;i++) {
      int temp = cur;
      cur+=pre;
      pre = temp;
      System.out.print(cur+" ");
    }
  }
}