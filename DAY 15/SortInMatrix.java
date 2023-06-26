import java.util.*;

public class SortInMatrix {
    static final int SIZE = 10;
    
    static void sortMat(int[][] mat, int n){
        int[] temp = new int[n*n];
        int k = 0;

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                temp[k++] = mat[i][j];
            }
        }
        Arrays.sort(temp);
        k = 0;

        for(int i=0;i<n;i++){
            for(int j =0; j<n;j++){
                mat[i][j] = temp[k++];
            }
        }
    }
    static void printMat(int[][] mat, int n)
    {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(mat[i][j] + " ");
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        int[][] mat
            = { { 5, 4, 7 }, { 1, 3, 8 }, { 2, 9, 6 } };
        int n = 3;
  
        System.out.println("Original Matrix:");
        printMat(mat, n);
  
        sortMat(mat, n);
  
        System.out.println("\nMatrix After Sorting:");
        printMat(mat, n);
    }
}
