import java.util.Scanner;

public class day14 {
  public static void main(String[] args) {
    System.out.println();
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the length of a side in the square :");
    int l = sc.nextInt();
    System.out.println("The perimeter of a square is :"+(l*4));
  }
}