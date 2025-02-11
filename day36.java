import java.util.Scanner;

public class day36 {
  public static void main(String[] args) {
    System.out.println();
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    System.out.println(isarmstrong(num));
  }
  public static boolean isarmstrong(int num) {
    int digit = 0;
    int n1 = num;
    while(n1 != 0 ) {
      digit++;
      n1/=10;
    }
    System.out.println(digit);
    n1 = num;
    int res = 0;
    while(n1!=0) {
      int rem = n1%10;
      int ans = 1;
      for(int i=0;i<digit;i++) {
        ans*=rem;
      }
      res+=ans;
      n1/=10;
    }
    System.out.println(res);
    if(res == num) return true;
    return false;
  }
}
