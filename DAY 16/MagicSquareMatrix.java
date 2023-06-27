public class MagicSquareMatrix {
    static int N = 3;
     
    // Returns true if mat[][] is magic
    // square, else returns false.
    static boolean isMagicSquare(int mat[][])
    {
         
        // sumd1 and sumd2 are the sum of the two diagonals
        int sumd1 = 0,sumd2=0;
        for (int i = 0; i < N; i++)
        {
            // (i, i) is the diagonal from top-left -> bottom-right
               // (i, N - i - 1) is the diagonal from top-right -> bottom-left
            sumd1 += mat[i][i];
               sumd2 += mat[i][N-1-i];
        }
    // if the two diagonal sums are unequal then it is not a magic square
        if(sumd1!=sumd2)
            return false;
 
        // calculating sums of Rows and columns and checking if they are equal to each other,
        // as well as equal to diagonal sum or not
        for (int i = 0; i < N; i++) {
 
            int rowSum = 0, colSum = 0;
            for (int j = 0; j < N; j++)
            {
                rowSum += mat[i][j];
                colSum += mat[j][i];
            }
            if (rowSum != colSum || colSum != sumd1)
                return false;
        }
 
 
        return true;
    }
 
    // driver program to
    // test above function
    public static void main(String[] args)
    {
        int mat[][] = {{ 2, 7, 6 },
                       { 9, 5, 1 },
                       { 4, 3, 8 }};
 
        if (isMagicSquare(mat))
            System.out.println("Magic Square");
        else
            System.out.println("Not a magic" + " Square");
    }
}
