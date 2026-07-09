class Solution {
    public boolean isPowerOfFour(int n) {

        //APPROACH 1 (BY USING LOOP) O(log4 N)
        if (n <= 0) return false;

        while (n % 4 == 0) {
            n /= 4;
        }

        return n==1;


        //APPROACH -2 (WITHOUT LOOP OR RECURSION) BIT MANIULATION

        //return n > 0 &&(n & (n - 1)) == 0 &&(n - 1) % 3 == 0;

        /*
        1.(n>0) CHECKS FOR POSITIVE NUMBER
        2. (n&(n-1))==0  checks for power of 2 eg 1 2 4 8 16 32 .......

        but we only want 1,4 16,64......
        so to remove thsi we have to add this operatiion 

        3. (n-1)%3== 0 to remove onlt the number which is power of but not power of 4
             */
    }
}