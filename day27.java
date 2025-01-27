import java.util.Scanner;

public class day27 {
  public static void main(String[] args) {
    System.out.println();
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    if(num<0) System.out.println("The number is negative");
    else if (num>0) System.out.println("The number is positive");
    else System.out.println("The number is zero");
  }
}
