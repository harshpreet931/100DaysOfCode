public class PalindromNumbersPT2 {
    static boolean checkP(String str){
        int len = str.length();

        for(int i=0;i<len/2;i++){
            if(str.charAt(i)!=str.charAt(len-i-1)) return false;
        }
        return true;
    }    
    public static void main(String[] args) {
        String num = "123454321";
        if (checkP(num))
        System.out.print("Yes");
        else
        System.out.print("No");
    }
}
