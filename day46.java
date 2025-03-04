import java.util.Scanner;

public class day46 {
  public static void main(String[] args) {
    System.out.println();
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    int count = 0;
    for(int i=0;i<s.length();i++) {
      char c = s.charAt(i);
      if(c == 'a' || c == 'A' ||c == 'e' || c == 'E' ||c == 'i' || c == 'I' || c == 'o' || c == 'O' || c == 'u' || c == 'U') {
        count++;
      }
    }
    System.out.println(count);
  }
}
