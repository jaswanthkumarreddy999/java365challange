import java.util.Scanner;

public class day43{
  public static void main(String[] args) {
    System.out.println();
    Scanner sc = new Scanner(System.in);
    char c = sc.next().charAt(0);
    if((c>='a' && c<='z')||(c>='A'&&c<='Z')) {
      System.out.println("The character is alphabet");
    } else if(c>='0' && c<='9') {
      System.out.println("the given character is digit");
    } else {
      System.out.println("the given character is special character");
    }
  }
}