import java.util.Scanner;

public class day24 {
  public static void main(String[] args) {
    System.out.println();
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt(),sum=0;
    while(n!=0) {
      System.out.println(sum +" "+n);
      sum+=n%10;
      n/=10;
    }
    System.out.println("the sum of digits of the number given is :"+sum);
  }
}
//sum = sum + n % 10; 3 = 0 + 3 123%10 
//12   =>  5=3+2   12%10 = 2 => 1