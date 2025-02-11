import java.util.Scanner;

public class day40 {
  public static void main(String[] args) {
    System.out.println();
    Scanner sc = new Scanner(System.in);
    int num =sc.nextInt();
    System.out.println(strong(num));
  }
  public static Boolean strong(int num) {
    int[] fact = new int[10];
    fact[0] = 1;
    fact[1] = 1;
    fact[2] = 2;
    fact[3] = 6;
    fact[4] = 24;
    fact[5] = 120;
    fact[6] = 720;
    fact[7] = 5040;
    fact[8] = 40320;
    fact[9] = 362880;
    int temp=num;
    int sum=0;
    while(num!=0) {
      sum+=fact[num%10];
      num/=10;
    }
    if(temp==sum)return true;
    return false;
  }
}
