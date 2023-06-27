public class MatrixMultiplications {
    public static void multiply(int m1, int m2, int mat1[][], int n1, int n2, int mat2[][])
  {
    int x, i, j;
    int res[][] = new int[m1][n2];
    for (i = 0; i < m1; i++) {
      for (j = 0; j < n2; j++) {
        res[i][j] = 0;
        for (x = 0; x < m2; x++) {
          res[i][j] += mat1[i][x] * mat2[x][j];
        }
      }
    }
    for (i = 0; i < m1; i++) {
      for (j = 0; j < n2; j++) {
        System.out.print(res[i][j] + " ");
      }
      System.out.println();
    }
  }
  
  // Driver code
  public static void main(String[] args)
  {
    int m1 = 2, m2 = 2, n1 = 2, n2 = 2;
    int mat1[][] = new int[][] { { 1, 1 }, { 2, 2 } };
    int mat2[][] = new int[][] { { 1, 1 }, { 2, 2 } };
  
    // Function call
    multiply(m1, m2, mat1, n1, n2, mat2);
  }    
}
