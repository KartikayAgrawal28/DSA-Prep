class Solution {
    public int[] sortArrayByParity(int[] nums) {
        
        int n = nums.length;
        int[] res = new int[n];
        
        int even=0;
        int odd=n-1; 
        for(int i:nums){
            if(i%2==0){
                res[even] = i;
                even++;
            }
            else{
                res[odd] = i;
                odd--;
            }
        }

        return res;
    }
}