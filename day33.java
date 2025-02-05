import java.util.Scanner;

public class day33 {
  public static void main(String[] args) {
    System.out.println();
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the base :");
    int base = sc.nextInt();
    System.out.println("Enter the exponent :");
    int power = sc.nextInt();
    int result = 1;
    while(power!=0) {
      result*=base;
      power--;
    }
    System.out.println("the result is "+result);
  }
}
