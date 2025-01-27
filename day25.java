import java.util.Scanner;

public class day25 {
  public static void main(String[] args) {
    System.out.println();
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int rev = 0;
    while(num!=0) {
      rev=(rev*10)+(num%10);
      num=num/10;
    }
    System.out.println("The reverse of the given number is : "+rev);
  }
}
// 345                rev   num
//     5=0+5          5     34
//     54=(5*10)+4    54    3
//     543=(54*10)+3  543   0