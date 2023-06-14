import java.util.*;
public class Q5_RotationOfArrayButO1Space {
    static void leftR(int arr[], int n, int k){
        int mod = k%n;

        for(int i=0;i<n;i++) System.out.print(arr[(i+mod)%n]+" ");
        System.out.println();
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++) arr[i] = sc.nextInt();

        System.out.println("Enter how many times you wanna rotate:");
        int k = sc.nextInt();

        leftR(arr, n, k);
        sc.close();
    }
}
