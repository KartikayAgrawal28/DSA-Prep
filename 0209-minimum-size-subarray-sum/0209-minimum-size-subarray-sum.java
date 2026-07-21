class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left=0, n=nums.length, sum=0;
        int ans = Integer.MAX_VALUE;

        for(int right=0;right<n;right++){
            sum += nums[right];

            while(sum>=target){
                ans = Math.min(ans, right-left+1);
                sum -= nums[left];
                left++;
            }
        }

        // by using ternary operator
        return ans == Integer.MAX_VALUE ? 0 : ans; 
    }
}