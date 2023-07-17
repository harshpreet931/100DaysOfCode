public class IsPrimePT2 {
    static boolean isPrime(int n)
    {
        if (n <= 1)
            return false;
 
        else if (n == 2)
            return true;
 
        else if (n % 2 == 0)
            return false;
 
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args)
    {
        if (isPrime(19))
            System.out.println("true");
 
        else
            System.out.println("false");
    }
}
