import java.util.Scanner;

public class day42 {
  public static void main(String[] args) {
    System.out.println();
    Scanner sc = new Scanner(System.in);
    char c = sc.next().charAt(0);

    if (c == 'a' || c == 'A') {
      System.out.println("Vowel");
    } else {
      System.out.print("Consonant");
    }

  }
}