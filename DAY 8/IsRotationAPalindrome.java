public class IsRotationAPalindrome {
    static boolean isPalindrome(String str)
    {
        int l = 0;
        int h = str.length() - 1;
 
        while (h > l)
            if (str.charAt(l++) != str.charAt(h--))
                return false;
        return true;
    }
 
    static boolean isRotationOfPalindrome(String str)
    {
        if (isPalindrome(str))
            return true;
        int n = str.length();
        for (int i = 0; i < n - 1; i++) {
            String str1 = str.substring(i + 1);
            String str2 = str.substring(0, i + 1);
 
            if (isPalindrome(str1 + str2))
                return true;
        }
        return false;
    }

    public static void main(String[] args)
    {
        System.out.println((isRotationOfPalindrome("aab")) ? 1 : 0);
        System.out.println((isRotationOfPalindrome("abcde")) ? 1 : 0);
        System.out.println((isRotationOfPalindrome("aaaad")) ? 1 : 0);
    }
}
