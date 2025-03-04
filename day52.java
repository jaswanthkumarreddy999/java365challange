import java.util.Scanner;

public class day52 {
  public static void main(String[] args) {
    System.out.println();
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    s = s.replace("a","");
    s = s.replace("e","");
    s = s.replace("i","");
    s = s.replace("o","");
    s = s.replace("u","");
    s = s.replace("A","");
    s = s.replace("E","");
    s = s.replace("I","");
    s = s.replace("O","");
    s = s.replace("U","");
    System.out.println(s);
  }
}
