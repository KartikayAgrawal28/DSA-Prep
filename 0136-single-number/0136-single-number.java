class Solution {
    public int singleNumber(int[] nums) {
        int count = 0;

        // by using xor property we can solve this question
        //1: x^0=x
        //2: x^x=0
        // 3: a^b^c = a^(b^c) = (a^b)^c = (a^c)^b
        for(int i:nums){
            count^=i;
        }

        return count;
        
    }
}