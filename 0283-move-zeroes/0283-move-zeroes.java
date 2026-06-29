class Solution {
    public void moveZeroes(int[] nums) {

        int j = 0;  // position for next non-zero

        for(int i = 0; i < nums.length; i++) {

            /* dono pointer 0 se start honge 
                hame check karna hai ki jo zero hai usko laast me shift karna hai 

             */
            if(nums[i] != 0) {
                // ye jayada time caarry karega non zero elements
                int temp = nums[i];
                
                // ye kaam karega non zero ko pehle shift karne me 
                nums[i] = nums[j];

                // ye kaam karega zero ko last me shift karne ke
                
                nums[j] = temp;
                j++;
            }
        }
    }
}