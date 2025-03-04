public class day64 {
  public static void main(String[] args) {
    System.out.println();
    int[] arr = {12,12,134,57,3,347,23,573,2,4,6,4,7,3,2,5,-5,-2};
    //
    int[] r = oddeven(arr);
    System.out.println(r[0]+" "+r[1]);
  }
  public static int[] oddeven(int[] arr) {
    int ec=0,oc=0;
    for(int i:arr) {
      if(i%2 == 0) {
        ec++;
      } else {
        oc++;
      }
    }
    int[] arr1 = {oc,ec};
    return arr1;
  }
}
