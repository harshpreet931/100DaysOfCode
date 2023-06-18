import java.util.*;
public class StringRotation {
    static String leftRot(String str, int d){
        String ans = str.substring(d) + str.substring(0,d);
        return ans;
    }
    static String rightRot(String str,int d){
        return leftRot(str, str.length()-d);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(leftRot(s, a));
        System.out.println(rightRot(s, b));
        sc.close();
    }
}
