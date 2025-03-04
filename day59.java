import java.util.Scanner;

public class day59 {
  public static void main(String[] args) {
    System.out.println();
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    for(int i=0;i<s.length();i++) {
      int v = (int)s.charAt(i);
      if( v < 48 || v > 57) {
        System.out.println("String is non numberic");
        return;
      }
    }
    System.out.println("String is numberic");
  }
}
