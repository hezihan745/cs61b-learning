public class BreakContinue {
  public static void windowPosSum(int[] a, int n) {
    int a_length = a.length;
    for (int i = 0; i < a_length; i++) {
      if (a[i] < 0) {
        continue;
      } else {
        for (int m = 1; m < n + 1; m++) {
          if ((i + m) >= a_length) {
            break;
          } else {
            a[i] += a[i + m];
          }
        }
      }
    }
  }

  public static void main(String[] args) {
    int[] a = {1, -1, -1, 10, 5, -1};
    int n = 2;
    windowPosSum(a, n);

    // Should print 4, 8, -3, 13, 9, 4
    System.out.println(java.util.Arrays.toString(a));
  }
}