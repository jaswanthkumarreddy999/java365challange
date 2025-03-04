public class day66 {
  public static void main(String[] args) {
    System.out.println();
    int arr[] = {13,51,4,1,45,1,4,14,6,1,46,1,46,1,278,7,5275375,73,3};
    odd(arr);
  }
  public static void odd(int arr[]) {
    for(int i=1;i<arr.length;i=i+2){
      System.out.print(arr[i]+" ");
    }
  }
}
