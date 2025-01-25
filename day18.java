import java.util.Scanner;

public class day18 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println();
    System.out.println("Enter the temperature in farnheit : ");
    float temp = sc.nextFloat();
    System.out.println("The temperature in celsius : "+((temp-32)/1.8));

  }
}
