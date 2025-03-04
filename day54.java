import java.util.HashMap;
import java.util.Scanner;

public class day54 {
  public static void main(String[] args) {
    System.out.println();
    Scanner sc = new Scanner(System.in);
    String s1 = sc.nextLine();
    String s2 = sc.nextLine();
    System.out.println(ca(s1,s2));
  }
  public static boolean ca(String s1,String s2) {
    HashMap<Character,Integer> hm1 = new HashMap<>();
    HashMap<Character,Integer> hm2 = new HashMap<>();
    int l1 = s1.length();
    int l2 = s2.length();
    if(l1 != l2)return false;
    for(int i=0;i<l1;i++) {
      Character c = (Character)s1.charAt(i);
      // if(hm1.containsKey(c)){
      //   hm1.put(c,hm1.get(c)+1)
      // }else{
      //   hm1.put(c,1);
      // }
      hm1.put(c,hm1.getOrDefault(c,0)+1);
    }
    for(int i=0;i<l1;i++) {
      Character c = (Character)s2.charAt(i);
      // if(hm1.containsKey(c)){
      //   hm2.put(c,hm2.get(c)+1)
      // }else{
      //   hm2.put(c,1);
      // }
      hm2.put(c,hm2.getOrDefault(c,0)+1);
    }
    System.out.println(hm1);
    System.out.println(hm2);
    if(hm1.equals(hm2))return true;
    return false;
  }
}
