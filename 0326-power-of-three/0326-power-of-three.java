class Solution {
    public boolean isPowerOfThree(int n) {
        // APPROACH 1 BY BRUTE FORCE 
        // if(n<=0){
        //     return false;
        // }

        // while(n%3==0){
        //     n/=3;
        // }
        // return n==1;

        //APPROACH 2 OPTIMISED

        return n > 0 && 1162261467 % n == 0;

        // 1162261467 IS THE LARGEST VALUE UNDER POWER FO 3 WHICH FITS IN INT RANGE I.E 3^19

    }
}