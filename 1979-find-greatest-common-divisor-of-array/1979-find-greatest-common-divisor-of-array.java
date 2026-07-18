class Solution {
    public int findGCD(int[] nums){
        // int min=nums[0];
        // int max=nums[0];
        

        // for(int i:nums){
        //     if(i>max) max=i;
            
        //     if(i<=min) min=i;
        // }
        // int gcd=1;
        // for(int i=1;i<=min;i++){
        //     if(max%i==0 && min%i==0){
        //         gcd=i;
        //     }
        // }
        // return gcd;


        Arrays.sort(nums);
        int min = nums[0];
        int max = nums[nums.length -1];

        while(max!=0){
            int temp = max;
            max=min % max;
            min = temp;
        }

        return min;
    }    
}