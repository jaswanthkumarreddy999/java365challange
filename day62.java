public class day62 {
  public static void main(String[] args) {
    System.out.println();
    int[] arr = {12,6,8,43,27,232,6247,0,-2,2,5,3,12,-50};
    System.out.println(largest(arr));
  }
  public static int largest(int[] arr) {
    int max=Integer.MIN_VALUE,len=arr.length;
    for(int i:arr)max=Math.max(i,max);
    return max;
  }
}
