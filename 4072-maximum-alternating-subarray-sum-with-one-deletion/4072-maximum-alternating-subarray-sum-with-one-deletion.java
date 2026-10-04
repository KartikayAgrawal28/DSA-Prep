class Solution {
    public long maxAlternatingSum(int[] nums) {

        Long NEG = Long.MIN_VALUE/4;
        long plus=NEG, minus=NEG, dPlus=NEG, dMinus=NEG, qPlus=NEG, qMinus = NEG, ans=NEG;

        for(int x:nums){
            long oldPlus = plus;
            long oldMinus = minus;
            long oldDplus = dPlus;
            long oldDminus = dMinus;

            plus = Math.max(x, oldMinus + x);
            minus = oldPlus-x;

            dPlus = Math.max(oldDminus + x, qMinus+x);
            dMinus = Math.max(oldDplus - x, qPlus-x);

            qPlus = oldPlus;
            qMinus = oldMinus;

            ans = Math.max(ans, Math.max(Math.max(plus,minus), Math.max(dPlus,dMinus)));
        }
        return ans;
    }
}