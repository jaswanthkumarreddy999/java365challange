import java.util.Scanner;

public class day11 {
  public static void main(String[] args) {
    System.out.println();
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();//a=5
    int b = sc.nextInt();//b=10
    a=a+b;//a=15
    b=a-b;//b=5
    a=a-b;//a=10
    System.out.println(a+" "+b);
  }
}
