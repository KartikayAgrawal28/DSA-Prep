class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit=0;
        int left=0;  // left = buying date   && right = selling date 
        int profit=0;
        for(int right=1 ; right<prices.length ; right++){
            
            profit = prices[right] - prices[left];
            maxProfit = Math.max(maxProfit , profit );
            
            //shrrinking of window
            while(prices[right]<prices[left]){

                left++;

            }
        }
        return maxProfit;


    }
}