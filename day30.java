import java.util.Scanner;

public class day30 {
  public static void main(String[] args) {
    System.out.println();
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int result =1;
    for(int i=1;i<=n;i++)result*=i;
    System.out.println("the factorial of "+n+" is "+result);
  }
}
