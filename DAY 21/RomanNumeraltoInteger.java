import java.util.*;

public class RomanNumeraltoInteger {
    public static void romantoInt(String s){
        Map<Character,Integer> t = new HashMap<Character,Integer>();
        t.put('I',1); 
        t.put('V',5); 
        t.put('X',10); 
        t.put('L',50); 
        t.put('C',100); 
        t.put('D',500); 
        t.put('M',1000);

        s = s.replace("IV","IIII");
        s = s.replace("IX","VIIII");
        s = s.replace("XL","XXXX");
        s = s.replace("XC","LXXXX");
        s = s.replace("CD","CCCC");
        s = s.replace("CM","DCCCC");

        int number = 0;
        for(int i=0;i<s.length();i++){
            number = number + (t.get(s.charAt(i)));
        }
        System.out.println(number);
    }
    public static void main(String[] args){
        romantoInt("MCMIV");
    }    
}
