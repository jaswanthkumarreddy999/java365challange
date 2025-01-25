import java.util.Scanner;

public class day17 {
  public static void main(String[] args) {
    System.out.println();
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the temperature in celsius : ");
    float temp = sc.nextFloat();
    System.out.println("The temperature in farenhiet : "+((temp*1.8)+32));
  }
}
//c = (f-32)/1.8