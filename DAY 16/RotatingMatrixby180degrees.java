public class RotatingMatrixby180degrees {
    
    public static int R = 4;
    public static int C = 4;
  
    // Function to rotate the matrix by 180 degree
    public static void reverseColumns(int[][] arr) {
        for (int i = 0; i < C; i++)
            for (int j = 0, k = C - 1; j < k; j++, k--) {
                int temp = arr[j][i];
                arr[j][i] = arr[k][i];
                arr[k][i] = temp;
            }
    }
  
    // Function for transpose of matrix
    public static void transpose(int[][] arr) {
        for (int i = 0; i < R; i++)
            for (int j = i; j < C; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
    }
  
    // Function for display the matrix
    public static void printMatrix(int[][] arr) {
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++)
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }
    }
  
    // Function to anticlockwise rotate matrix by 180 degree
    public static void rotate180(int[][] arr) {
        transpose(arr);
        reverseColumns(arr);
        transpose(arr);
        reverseColumns(arr);
    }
  
    // Driver code
    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3, 4 },
            { 5, 6, 7, 8 },
            { 9, 10, 11, 12 },
            { 13, 14, 15, 16 }
        };
        rotate180(arr);
        printMatrix(arr);
    }

}
