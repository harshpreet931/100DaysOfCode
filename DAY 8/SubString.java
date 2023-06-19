import java.util.*;
public class SubString {
    public static void SubS(String str, int n){
        for(int i=0;i<n;i++){
            for(int j=i+1;j<=n;j++){
                System.out.println(str.substring(i, j));
            }
        }
    }
    public static void main(String[] main){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        SubS(str, str.length());
        sc.close();
    }
}
