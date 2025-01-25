import java.util.Scanner;

public class day12 {
  public static void main(String[] args) {
    System.out.println();
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the length of rectangle");
    int l = sc.nextInt();
    System.out.println("Enter the breadth of a rectangle");
    int b = sc.nextInt();
    if(l == b) {
      System.out.println("the area of square is equal to :"+(l*b));
    } else 
    System.out.println("the area of rectangle is equal to :"+(l*b));

  }
}
