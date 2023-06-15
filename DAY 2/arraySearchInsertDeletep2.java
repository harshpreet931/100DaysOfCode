import java.util.*;
public class arraySearchInsertDeletep2 {
    static int findElement(int arr[], int n, int key){
        for(int i=0;i<n;i++)
            if(arr[i]==key) return i;
        return -1;
    }
    static void insertElement(int arr[], int n,int x,int pos){
        for(int i=n-1;i>=pos;i--)
            arr[i+1] = arr[i];
            arr[pos] = x;
    }
    static int deleteElement(int arr[], int n, int key){
        int pos = findElement(arr, n, key);

        if(pos==-1){
            System.out.println("Element not found");
            return n;
        }

        int i;
        for(i = pos;i<n-1;i++)
            arr[i] = arr[i+1];
        
        return n-1;
    }
}
