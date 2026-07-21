class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int count=0, prod=1;
        int n = nums.length;

        // check base case 
        if(k<=1) return 0;  
        /* 

        Aproach 1 --> BRUTE FORCE O(2N)

        for(int i=0;i<n;i++){
            
            prod=1;
            for(int j=i;j>=0;j--){
                prod *= nums[j];

                if(prod<k){
                    count++;
                }
                else{
                    break;
                }
            }
        }*/


        // APPROACH 2 ----> OPTIMISED

        int l=0;

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