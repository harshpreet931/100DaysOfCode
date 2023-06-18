import java.util.*;

public class SortString {
    static void sS(String str){
        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        System.out.print("The sorted String is: "+String.valueOf(arr));
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sS(s);
        sc.close();
    }
}
