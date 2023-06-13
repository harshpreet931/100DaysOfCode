import java.util.*;
public class Q1_LargestThreeElementsArr {
     public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter the number of elements in array: ");
     int n = sc.nextInt();
     int[] arr = new int[n];

     for(int i=0;i<n;i++) arr[i] = sc.nextInt();
     int a,b,c;

     a = b = c = Integer.MIN_VALUE;
     for(int i=0;i<n;i++){
          if(arr[i]>a){
               c = b;
               b = a;
               a = arr[i];
          }
          else if(arr[i] > b){
               c = b;
               b = arr[i];
          }
          else if(arr[i] > c){
               c = arr[i];
          }
     }
     System.out.println("The largest elements are: "+a+" "+b+" "+c);
     sc.close();


}
}

// Time complexity : O(n)
// Auxiliary Space : O(1)