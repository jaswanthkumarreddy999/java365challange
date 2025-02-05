public class day32 {
  public static void main(String[] args) {
    System.out.println();
    int a = 1;
    int b = 3;
    int c = 6;
    if(a>b && a>c) {
      System.out.println("a is largest");
    } else if(  b>c && b>a) {
      System.out.println("b is greatest");
    } else {
      System.out.println("c is greatest");
    }
  }
}
