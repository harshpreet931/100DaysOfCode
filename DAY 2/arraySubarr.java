import java.util.*;

public class arraySubarr {
    static void prtSubArr(int[] arr, int start, int end){
        if (end==arr.length) return;

        else if(start>end) prtSubArr(arr, 0, end+1);

        else{
            System.out.print("[");

            for(int i=start;i<end;i++){
                System.out.print(arr[i]+", ");
            }
            System.out.println(arr[end]+"]");
            prtSubArr(arr, start+1, end);
        }
        return;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount of elements in an array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        prtSubArr(arr, 0, 0);
        sc.close();
    }
}
