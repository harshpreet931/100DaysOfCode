import java.util.*;
public class CountDistinctSubsequences {
    
    public static int countSub(String s){
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();

        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),-1);
        }

        int allCount = 0;
        int levelCount = 0;

        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(i==0){
                allCount = 1;
                map.put(c,1);
                levelCount = 1;
                continue;
            }
            levelCount = allCount + 1;

            if(map.get(c)<0) allCount += levelCount;
            else allCount += levelCount - map.get(c);
            map.put(c,levelCount);

        }
        return allCount;
    }
    public static void main(String[] args){
        List<String> list = Arrays.asList("abab","oasfmaw");
        for(String s : list)
    {
      int cnt = countSub(s);
      int withEmptyString = cnt+1;
      System.out.println("With empty string count for " + s +" is " + withEmptyString);
      System.out.println("Without empty string count for " + s + " is " + cnt);
    }
  }
}
