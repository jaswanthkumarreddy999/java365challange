import java.util.Scanner;

public class day37 {
  public static void main(String[] args) {
    System.out.println();
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    System.out.println(isperfect(num));
  }
  public static boolean isperfect(int num) {
    int sum=0;
    for(int i=1;i<=num/2;i++) if(num%i == 0) sum+=i;
    if(sum == num) return true;
    return false;
  }
}
