import java.util.*;

class Olala{
    static void reord(int arr[],int index[]){
        int temp[] = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            temp[index[i]] = arr[i];
        }
        for(int i=0;i<arr.length;i++){
            arr[i] = temp[i];
            index[i] = i;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n]; int[] index = new int[n];
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();
        for(int i=0;i<n;i++) index[i] = sc.nextInt();
        reord(arr, index);
        System.out.println("Reordered array is: ");
        System.out.println(Arrays.toString(arr));
        System.out.println("Modified Index array is:");
        System.out.println(Arrays.toString(index));
        sc.close();
    }
}