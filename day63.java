public class day63 {
  public static void main(String[] args) {
    System.out.println();
    int[] arr = {-10,0,2,4,8,3,2,25,37,84,-6,9};
    System.out.println(small(arr));
  }
  public static int small(int[] arr) {
    int min = Integer.MAX_VALUE,len = arr.length;
    for(int i:arr)min=Math.min(min,i);
    return min;
  }
}
