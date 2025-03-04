import java.util.HashSet;
import java.util.Scanner;

public class day60 {
  public static void main(String[] args) {
    System.out.println();
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    HashSet hs = new HashSet<>();
    for(int i=0;i<s.length();i++) {
      char target = s.charAt(i);
      if(hs.contains(target))continue;
      hs.add(target);
      boolean pin = true;

      for(int j=i+1;j<s.length();j++) {
        char val = s.charAt(j);
        if(target == val) {
          pin = false;
          break;
        } 
      }
      if(pin) {
        System.out.println(target);
        return;
      }
    }
    System.out.println("not found a non repeating character");
  }
}
