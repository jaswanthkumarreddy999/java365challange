import java.util.Scanner;

public class day29 {
  public static void main(String[] args) {
    System.out.println();
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for(int i=1;i<=10;i++)
      System.out.println(n+" "+"X"+" "+i+" = "+(n*i));
  }
}