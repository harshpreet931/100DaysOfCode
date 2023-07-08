public class ArrayChangingSize {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        arr = new int[arr.length+1];
        System.out.println(arr.length);
        for(int i=0;i<arr.length;i++) System.out.println(arr[i]);    
    }
}
