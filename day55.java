import java.util.Scanner;

public class day55 {
  public static void main(String[] args) {
    System.out.println();
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    int i=0;
    //hello world
    while(true) {
      try{
        char c = s.charAt(i);
        i++;
      }catch(Exception e) {
        System.out.println(e);
        System.out.println(i);
        return;
      }
    }
  }
}