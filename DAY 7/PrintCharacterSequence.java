import java.util.*;
public class PrintCharacterSequence {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();

    Map<Character, Integer> mp = new HashMap<Character, Integer>();

    for(char c: s.toCharArray()){
        if(mp.containsKey(c)){
            mp.put(c, mp.get(c)+1);
        }
        else{
            mp.put(c,1);
        }
    }
    System.out.println("All character in string with their frequency:");
    for(Map.Entry<Character, Integer> entry : mp.entrySet()){
        System.out.print(entry.getKey()+""+entry.getValue());
    }
    sc.close();
    }
}
