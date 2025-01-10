import java.util.Scanner;

public class day9 {
    public static void main(String[] args) {
        System.out.println();
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        if(num1 > num2) {
            System.out.println(num1+" is greater than "+num2);
        } else if(num2>num1) {
            System.out.println(num2+" is greater than "+num1);
        }   else {
            System.out.println("Both the values are equal");
        }
    }
}