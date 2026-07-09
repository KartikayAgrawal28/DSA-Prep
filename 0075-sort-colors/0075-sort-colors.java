class Solution {
    public void sortColors(int[] nums) {

        //APPROACH 1 BRUTE FORCE APPROACH
        
        // for(int i=0;i<nums.length-1;i++){
        //     for(int j=i+1;j<nums.length;j++){
        //         if(nums[i]>nums[j]){
        //             int temp = nums[i];
        //             nums[i] = nums[j];
        //             nums[j] = temp;
        //         }
        //     }
        // }
        

        // APPROACH 2 THE OPTIMISED WITH three POINTERS

        int i = 0, j=0, k=nums.length-1;
        
        // here i ---> for 0
        // here j ---> current position
        // here k ---> for 2

        while(j<=k){
            // for 0 --> red
            if(nums[j]==0){
                swap(nums,i,j);
                i++;
                j++;
            }
            // for 1 ---> white
            else if(nums[j]==1){
                j++;
            }
            // for 2 ---> blue
            else{
                swap(nums,j,k);
                k--;
            }
        }

    }

    // function for swap of numbers

    public void swap(int[] nums, int a, int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}

