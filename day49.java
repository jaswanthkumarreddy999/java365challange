import java.util.Scanner;

public class day49 {
  public static void main(String[] args) {
    System.out.println();
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    StringBuilder sb = new StringBuilder(s);
    System.out.println(sb.reverse().toString());
  }
}