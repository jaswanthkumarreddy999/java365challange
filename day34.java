import java.util.Scanner;

public class day34 {
  public static void main(String[] args) {
    System.out.println();
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for(int i=2;i*i<=n;i++) {
      if(n%i == 0) {
        System.out.println("the given number is not prime");
        return;
      }
    }
    System.out.println("the given number is prime");
  }
}
