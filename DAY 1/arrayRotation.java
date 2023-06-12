import java.util.*;
public class arrayRotation {
    public static void rotate(int arr[], int d, int n){
        int p = 1;
        while(p<=d){
            int last = arr[0];
            for(int i=0;i<n-1;i++){
                arr[i] = arr[i+1];
            }
            arr[n-1] = last;
            p++;
        }

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

        rotate(arr,d,n);
        sc.close();
        
    }

}
