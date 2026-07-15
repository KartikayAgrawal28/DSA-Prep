class Solution {
    public int gcdOfOddEvenSums(int n) {
        
        /*
        sumOdd = 1+3+5+7.....2n-1 = n^2

        sumEven = 2+4+6+8+.....2n = n(n+1)

            GCD(n^2 , n(n+1))
        --> n * GCD(n, n+1)
        
        since n and n+1 are co primes 
        so, GCD(n,n+1) = 1
        
        --> n * 1

        therefore, GCD(n^2, n(n+1)) = n;
         */


        
        return n;
    }

   
}