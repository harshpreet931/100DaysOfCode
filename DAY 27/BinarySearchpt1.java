import java.util.*;
public class BinarySearchpt1 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int target = 8;
        int idx = Arrays.binarySearch(arr,target);
        System.out.println(idx);
    }
}
