class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int count=0,prod=1,l=0;
        int n = nums.length;

        // check base case  
        if(k<=1) return 0;  
        
        // APPROACH 2 ----> OPTIMISED
        
        for(int r=0 ; r<n ; r++){
            prod *= nums[r];

            while(prod>=k){
                prod /= nums[l];
                l++;
            }
            count += r - l + 1;
        }
        return count;
    }
}