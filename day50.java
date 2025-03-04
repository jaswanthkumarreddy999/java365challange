import java.util.Scanner;

public class day50 {
  public static void main(String[] args) {
    System.out.println();
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    StringBuilder sb = new StringBuilder(s);
    if(sb.reverse().toString().equals(s)) {
      System.out.println("palindrome");
    }else{
      System.out.println("not palindrome");
    }
  }
}