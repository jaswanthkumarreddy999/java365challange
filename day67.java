public class day67 {
  public static void main(String[] args) {
    System.out.println();
    int[] arr = {1,2,3,4,5,6,7,8,9,0};
    reverse(arr);
    for(int i:arr){
      System.out.print(i+" ");
    }
  }
  public static void reverse(int[] arr) {
    int l=0,r=arr.length-1;
    while(l<r) {
      int temp = arr[r];
      arr[r] = arr[l];
      arr[l] = temp;
      l++;
      r--;
    }
  }
}
