import java.util.*;
public class RemoveAllOccurancesOfACharacterInAString {
    public static String remChar(String word, char ch){
        StringBuilder s = new StringBuilder(word);
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == ch){
                s.deleteCharAt(i);
                i--;
            }
        }
        return s.toString();
    }
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            String word = sc.nextLine();
            char c = sc.next().charAt(0);
            System.out.println(remChar(word, c));
            sc.close();
    }
}

