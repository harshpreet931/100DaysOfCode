import java.util.*;
public class InAnArrayOfDuplicatesFindTheNonDuplicate {
    static int FS(int arr[], int n){
        int res = arr[0];
        for(int i=1;i<n;i++){
            res = res ^ arr[i];
        }
        return res;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();
        System.out.println("Element that occurs only once is: "+FS(arr, n));
        sc.close();
    }
}
