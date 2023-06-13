import java.util.*;
public class Q2_SecondLargestInArr {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
     System.out.print("Enter the number of elements in array: ");
     int n = sc.nextInt();
     int[] arr = new int[n];

     for(int i=0;i<n;i++) arr[i] = sc.nextInt();
        
     Arrays.sort(arr);
     System.out.println("The second largest element is: "+arr[n-2]);
     sc.close();

}
}
