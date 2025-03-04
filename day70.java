import java.util.HashSet;

public class day70 {
  public static void main(String[] args) {
    System.out.println();
    int a[] = {1,4,2,4,7,3,4,6,7,9,0,7,4,3,2,1,2,3,6,5,6,8,6};
    HashSet<Integer> hs = new HashSet<>();
    for(int i:a) {
      if(hs.contains(i))continue;
      System.out.println(i+" ");
      hs.add(i);
    }
    System.out.println(hs);
  }
}
