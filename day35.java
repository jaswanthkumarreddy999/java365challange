import java.util.Scanner;

public class day35 {
  public static void main(String[] args) {
    System.out.println();
    Scanner sc = new Scanner(System.in);
    System.out.println("Please enter the start value of range");
    int start = sc.nextInt();
    System.out.println("please enter the end value of range");
    int end = sc.nextInt();
    for(int i=start;i<=end;i++) {
      if(prime(i)) {
        System.out.print(i+" ");
      }
    }
  }
  public static boolean prime(int num) {
    for(int i=2;i*i<=num;i++)if(num%i == 0 ) return false;
    return true;
  }
}