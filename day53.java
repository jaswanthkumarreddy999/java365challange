import java.util.Scanner;

public class day53 {
  public static void main(String[] args) {
    System.out.println();
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    char t = sc.next().charAt(0);
    int freq = 0;
    for(int i=0;i<s.length();i++)
      if(s.charAt(i) == t)freq++;
    System.out.println(freq);
  }
}
