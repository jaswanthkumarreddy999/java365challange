public class day69 {
  public static void main(String[] args) {
    System.out.println();
    int rrr[] = {12,25,74,2,35,646,2342,574,2324,74,786,6,34,63,7};
    sort(rrr);
    for(int i:rrr)System.out.print(i+" ");
  }
  public static void sort(int[] rrr) {
    int n = rrr.length;
    for(int i=0;i<n-1;i++) {
      for(int j=0;j<n-1-i;j++) {
        if(rrr[j]<rrr[j+1]) {
          int temp = rrr[j];
          rrr[j] = rrr[j+1];
          rrr[j+1] = temp;
        }
      }
    }
  }
}
