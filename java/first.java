public class first {
  public static void main(String[] args) {
    int[][] a = {
      {1, 2, 3},
      {4, 5, 6},
      {7, 8, 9}
    };
    int[][] b = {
      {9, 8, 7},
      {6, 5, 4},
      {3, 2, 1}
    };

    int[][] c = multiply(a, b);
    System.out.println("Result:");
    printMatrix(c);
  }

  public static int[][] multiply(int[][] m1, int[][] m2) {
    int n = 3;
    int[][] res = new int[n][n];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        int sum = 0;
        for (int k = 0; k < n; k++) {
          sum += m1[i][k] * m2[k][j];
        }
        res[i][j] = sum;
      }
    }
    return res;
  }

  public static void printMatrix(int[][] m) {
    for (int i = 0; i < m.length; i++) {
      for (int j = 0; j < m[i].length; j++) {
        System.out.print(m[i][j] + (j == m[i].length - 1 ? "" : "\t"));
      }
      System.out.println();
    }
  }
}
