class Uhm {
    public static void main(String[] args){
        int arr[] = {0, 1, 2, 3, 4, 5, 7};
        int n = arr.length;
        int sm = 0;
        for(int i=0;i<n;i++){
            if(arr[i]==i) continue;
            else sm = i;
        }
        System.out.println(sm);
    }
}
