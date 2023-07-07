public class KadaneAlgorithm {
    static void Kadane(int[] arr, int n){
        int max_current = arr[0];
        int max_global = arr[0];

        for(int i=1;i<n;i++){
            max_current = Math.max(arr[i] , max_current + arr[i]);

            if(max_current > max_global) max_global = max_current;
        }

        System.out.println(max_global);

    }
    
    public static void main(String[] args){
        int[] arr = { -2 , 3 , 2 , -1 };
        int l = arr.length;
        Kadane(arr, l);
    }
}
