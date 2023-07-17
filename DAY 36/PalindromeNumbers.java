public class PalindromeNumbers {
    static boolean checkP(int n){
        int rev = 0;
        int temp = n;
        while(temp!=0){
            rev = (rev*10) + (temp%10);
            temp/=10;
        }
        return (rev == n);
    }
    public static void main(String[] args) {
        int n = 123454321;
        if(checkP(n)) System.out.println("TRUE");
        else System.out.println("FALSE");
    }
}
