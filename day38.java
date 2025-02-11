import java.util.Scanner;

public class day38 {
  public static void main(String[] args) {
    System.out.println();
    Scanner sc = new Scanner(System.in);
    int num1 = sc.nextInt();
    int num2 = sc.nextInt();
    System.out.println(brute(num1,num2));
  }
  public static int brute(int num1,int num2) {
    int gcd = 1;
    int i=2;
    while(i<=num1 && i<=num2) {
      if(num1%i ==0 && num2%i==0)gcd=i;
      i++;
    }
    return gcd;
  }
  
  public static int gcd(int a, int b) {
    return (b == 0) ? a : gcd(b, a % b);
  }
}
