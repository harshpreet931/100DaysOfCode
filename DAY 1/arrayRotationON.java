import java.util.*;
public class arrayRotationON {
    static void rotate(int arr[], int d, int n){
        int temp[] = new int[n];
        int j = 0;

        for(int i=d;i<n;i++){
            temp[j] = arr[i];
            j++;
        }

        for(int i=0;i<d;i++){
            temp[j] = arr[i];
            j++;
        }

        for(int i=0;i<n;i++){
            arr[i] = temp[i];
        }
    }

    static void printArr(int arr[] , int n){
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("How many times you wanna rotate?");
        int d = sc.nextInt();

        rotate(arr, d, n);
        printArr(arr, n);
        sc.close();
    }
}
