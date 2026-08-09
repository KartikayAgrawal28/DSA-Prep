class Solution {
    public int pivotIndex(int[] nums) {
        
        //BRUTE FORCE
         int n = nums.length;
        // for(int i=0;i<n;i++){ // loop for pivot index
        //     int leftSum=0, rightSum=0;
        //     for(int j=0;j<i;j++){
        //         leftSum += nums[j];
        //     }

        //     for(int k=i+1;k<n;k++){
        //         rightSum += nums[k];
        //     }

        //     if(leftSum == rightSum) return i;
        // }
        // return -1;


        //PREFIX SUM OPTIMISED
        int totalSum=0, leftSum=0;
        for(int i=0;i<n;i++){   // total sum
            totalSum += nums[i];
        }

        int rightSum=0;
        
        for(int i=0;i<n;i++){
            rightSum = totalSum - leftSum - nums[i];

            if(leftSum == rightSum) return i;

            leftSum += nums[i];
        }

        return -1;
    }
}