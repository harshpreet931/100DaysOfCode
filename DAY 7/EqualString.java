import java.util.*;
public class EqualString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();

        if(a.toLowerCase().equals(b.toLowerCase())) System.out.println("EQUAL");
        else System.out.println("NOT EQUAL");
        sc.close();
    }
}
