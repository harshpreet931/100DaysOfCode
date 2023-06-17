import java.util.*;

public class FindNoOfTriangles{
    static void CT(int[] A){
        int n = A.length;
        Arrays.sort(A);
        int count = 0;

        for(int i=n-1;i>=1;i--){
            int l = 0, r = i-1;
            while(l<r){
                if(A[l]+A[r]>A[i]){
                    count += r-l;
                    r--;
                }
                else{
                    l++;
                }
            }
        }
        System.out.print("No of possible combinations: "+count);

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        for(int i=0;i<n;i++){
            A[i] = sc.nextInt();
        }
        CT(A);
        sc.close();
    }
}