class Solution {
    public int maximumProduct(int[] nums) {
        //By sorting appraoch O(n logn)
        // int n = nums.length;
        // Arrays.sort(nums);
        // return Math.max(
        //     nums[n-1] * nums[n-2] * nums[n-3] ,
        //     nums[0]*nums[1]*nums[n-1]
        // );
        

        //Optmmised approach  O(n)

        int max1 = Integer.MIN_VALUE;
        int max2= Integer.MIN_VALUE; 
        int max3= Integer.MIN_VALUE;
        
        // check min because it may provide max number 
        int min1= Integer.MAX_VALUE;
        int min2= Integer.MAX_VALUE;

        for(int i:nums){
            // for largest 3
            if(i>=max1){
                max3=max2;
                max2=max1;
                max1=i;
            }else if(i>=max2){
                max3=max2;
                max2=i;
            }else if(i>max3){
                max3=i;
            }

            // for min 2

            if(i<=min1){
                min2=min1;
                min1=i;
            }else if(i<min2){
                min2=i;
            }
        }
        
        return Math.max(max1*max2*max3 , min1*min2*max1);

    }
}