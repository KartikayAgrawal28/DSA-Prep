class Solution {
    public int smallestIndex(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int n=DigitSum(nums[i]);
            if(n==i) return i;
            
        }    
        return -1;
    }

    int DigitSum(int a){
        int sum=0;
        while(a>0){
            sum+=a%10;
            a/=10;
        }
        return sum;
    }
}