import java.util.Scanner;

public class day16 {
  public static void main(String[] args) {
    System.out.println();
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the initial/principal amount : ");
    double p = sc.nextDouble();
    System.out.println("Enter the rate of interest : ");
    float r = (sc.nextFloat())/100;
    System.out.println("Enter the time period in years");
    float t = sc.nextFloat();
    System.out.println("Enter the number of times to compound per year");
    int n = sc.nextInt();
    double power = n*t;
    double base = 1+(r/n);
    double result = Math.pow(base, power);
    System.out.println("the compound interest is : "+((p*result)-p));
  }
}
