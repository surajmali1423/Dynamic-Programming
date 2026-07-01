package BasicQuestion;

public class FibonacciNumber {

    static int [] dp ;

    public static int ImplementFibbo(int n){

        if(n <= 1) return n;
        if(dp[n] != 0)  return dp[n];
        int ans = ImplementFibbo(n-1) + ImplementFibbo(n - 2);
        dp[n] = ans;
        return ans;
    }

    public static int Fibbo(int n){
         dp = new  int[n + 1];

         return ImplementFibbo(n);
    }

    public static void main(String[] args) {
        System.out.println(Fibbo(6));
    }
}

