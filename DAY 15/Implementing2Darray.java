import java.util.*;

public class Implementing2Darray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();

        int[][] arr = new int[r][c];

        int value = 1;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j] = value;
                value ++;
            }
        }

        System.out.println("The 2D array is:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }

}
