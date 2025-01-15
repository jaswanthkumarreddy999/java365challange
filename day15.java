import java.util.Scanner;

public class day15 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println();
    System.out.println("Enter the intial or principal amount : ");
    double p = sc.nextDouble();
    System.out.println("Enter the rate of interest : ");
    float r = sc.nextFloat();
    System.out.println("Enter the time in terms of year : ");
    float t = sc.nextFloat();
    System.out.println("The simple interest is : "+(p*t*r)/100);
  }
}