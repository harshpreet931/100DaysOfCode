import java.util.*;
 
public class SwappingCharInString {
    public static String swapCharacters(String s, int B, int C)
    {
        int N = s.length();
        C = C % N;
        char[] arr = s.toCharArray();
        for (int i = 0; i < B; i++) {
            char temp = arr[i];
            arr[i] = arr[(i + C) % N];
            arr[(i + C) % N] = temp;
        }
        return new String(arr);
    }
 
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int B = 4;
        int C = 3;
        s = swapCharacters(s, B, C);
        System.out.println(s);
        sc.close();
    }
}
 
