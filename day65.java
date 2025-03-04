public class day65 {
  public static void main(String[] args) {
    System.out.println();
    int arr[] = {1,5,2,3,6,5,3,7,3,235,574,2,24,37,45,264,7,3,37,3,0};
    even(arr);
  }
  public static void even(int[] arr) {
    for(int i=0;i<arr.length;i=i+2) {
      System.out.print(arr[i]+" ");
    }
  }
}
