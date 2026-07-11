class Solution {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length <= 1) {
            return 0;
        }
        int mP = 0; // maxProfit
        int minPrice = prices[0]; // minProfit
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            }
            else {
                int cP = prices[i] - minPrice; // currentProfit
                if (cP > mP) {
                    mP = cP;
                }
            }
        }
        
        return mP;
    }
}