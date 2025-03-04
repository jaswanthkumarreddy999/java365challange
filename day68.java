public class day68 {
  public static void main(String[] args) {
    System.out.println();
    int[] arr = {1,6,4,2,6,8,3,0,87,36,2,2723,73,37};
    sort(arr);
    for(int i:arr)System.out.print(i+" ");
  }
  public static void sort(int[] arr) {
    int n = arr.length;
    for(int i=0;i<n-1;i++) {
      for(int j=0;j<n-1-i;j++) {
        if(arr[j]>arr[j+1]) {
          int temp = arr[j];
          arr[j] = arr[j+1];
          arr[j+1] = temp;
        }
      }
    }
  }
}
