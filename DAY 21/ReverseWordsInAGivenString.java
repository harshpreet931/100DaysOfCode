public class ReverseWordsInAGivenString {
    static void rev(char str[], int start, int end){
        for(char temp; start<=end;start++,end--){
            temp = str[start];
            str[start] = str[end];
            str[end] = temp;
        }
    }
    static char[] revWords(char[] s){
        int start = 0;
        for(int end=0;end<s.length;end++){
            if(s[end]==' '){
                rev(s, start, end);
                start = end + 1;
            }
        }
        rev(s, start, s.length-1);
        rev(s, 0, s.length-1);
        return s;
    }
    public static void main(String[] args){
        String s = "this is just a test";
        char[] p = revWords(s.toCharArray());
        System.out.print(p);
    }
}
