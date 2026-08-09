class Solution {
    public int pivotIndex(int[] nums) {
        
        //BRUTE FORCE
        int n = nums.length;
        for(int i=0;i<n;i++){ // loop for pivot index
            int leftSum=0, rightSum=0;
            for(int j=0;j<i;j++){
                leftSum += nums[j];
            }

            for(int k=i+1;k<n;k++){
                rightSum += nums[k];
            }

            if(leftSum == rightSum) return i;
        }
        return -1;
    }
}