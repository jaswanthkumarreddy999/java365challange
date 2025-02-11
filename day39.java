import java.util.Scanner;

public class day39 {
  public static void main(String[] args) {
    System.out.println();
    Scanner sc = new Scanner(System.in);
    int num1 = sc.nextInt();
    int num2 = sc.nextInt();
    System.out.println((num1*num2)/gcd(num1,num2));
  }
  public static int lcm(int num1,int num2) {
    for(int i=Math.max(num1,num2);i<=num1*num2;i++) {
      if(i%num1 == 0 & i%num2 == 0)return i;
    }
    return num1*num2;
  }
  public static int gcd(int a, int b) {
    return (b == 0) ? a : gcd(b, a % b);
  }
  // lcm*gcd = num1*num2
}
