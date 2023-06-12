import java.util.*;
public class arrayReversal{
    static void revArr(int arr[], int start, int end){
        int temp;
        
        while (start<end){
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start ++;
            end --;
        }
    }

    static void printArr(int arr[], int size){
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");

        }
        System.out.println();
    }
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        printArr(arr, n);
        revArr(arr, 0, n-1);
        System.out.print("\nReversed array:"+" ");
        printArr(arr, n);

        sc.close();


    }
}