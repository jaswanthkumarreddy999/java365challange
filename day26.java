import java.util.Scanner;

public class day26{
  public static void main(String[] args) {
    System.out.println();
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int n = num,rev=0;
    while(num!=0)  {
      rev=rev*10+(num%10);
      num/=10;
    }
    if(n == rev ) System.out.println("its a palindorme");
    else System.out.println("its not a palindrome");
  }
}
// 121 121 ----->palindrome
//123  321 ------> not palindrome
