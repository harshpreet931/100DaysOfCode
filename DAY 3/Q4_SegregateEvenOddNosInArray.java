import java.util.*;
public class Q4_SegregateEvenOddNosInArray {
    public static void Seg(int arr[], int n){
        for(int i=-1,j=0;j<n;j++){
            if(arr[j]%2==0){
                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        for(int k=0;k<n;k++) System.out.print(arr[k]+" ");
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++) arr[i] = sc.nextInt();

        Seg(arr, n);
        sc.close();
    }
}
