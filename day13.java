import java.util.Scanner;

public class day13 {
  public static void main(String[] args) {
    System.out.println();
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the radius of circle :");
    int r = sc.nextInt();
    float f = 3.14159f;
    System.out.println("The area of a circle is equal to : "+(f*r*r));
  }
}
