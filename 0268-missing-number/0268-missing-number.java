class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        
        // check for sum of n number from 0---->n
        // remeeber to increase the range to 1 
        int sum= ((n+1)*n)/2;
        
        
        //sum of number present in the array
        for(int i=0;i<n;i++){
            sum-=nums[i];
        }
        return sum;
    }
}