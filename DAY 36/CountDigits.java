public class CountDigits {
    static int CountDig(int n){
        int count = 0;
        while(n!=0){
            count++;
            n/=10;
        }
        return count;
        // return (int)Math.floor(Math.log10(n)+1);
    }
    
    public static void main(String[] args){
        System.out.println(CountDig(12345));
    }    
}
