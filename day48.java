import java.util.Scanner;

public class day48 {
  public static void main(String[] args) {
    System.out.println();
    Scanner sc = new Scanner(System.in);
    String sen = sc.nextLine();
    int count=0;
    boolean ws=false;
    for(int i=0;i<sen.length();i++)  {
      char c = sen.charAt(i);
      if(c != ' ' && !ws ){
        ws = true;
      } else if(c == ' ' && ws ) {
        count++;
        ws=false;
      }
    }
    System.out.println(++count);
  }
}
