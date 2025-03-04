public class day61 {
  public static void main(String[] args) {
    System.out.println();
    int[] arr = {1,2,3,4,5,6,7,8,9,10};
    System.out.println(sum(arr));
  }
  public static int sum(int[] arr) {
    int sum =0 ;
    for(int i:arr)sum+=i;
    return sum;
  }
}