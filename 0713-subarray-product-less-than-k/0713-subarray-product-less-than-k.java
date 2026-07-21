class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int left=0, count=0, prod=1;
        int n = nums.length;

        // check base case 
        if(k<=0) return 0;  
    
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
        }
        return count;
    }
}