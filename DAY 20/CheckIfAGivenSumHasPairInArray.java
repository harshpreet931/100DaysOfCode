public class CheckIfAGivenSumHasPairInArray {
    static boolean cP(int A[], int size, int x){
        for(int i=0;i<size-1;i++){
            for(int j=i+1;j<size;j++){
                if(A[i]+A[j] == x){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args){
        int A[] = {0,-1,2,-3,1};
        int x = -2;
        int size = A.length;

        if(cP(A, size, x)) System.out.println("YES");
        else System.out.println("NO");
    }
}
