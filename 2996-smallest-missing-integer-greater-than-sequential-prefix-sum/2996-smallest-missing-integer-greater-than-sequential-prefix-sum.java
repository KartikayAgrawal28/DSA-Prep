class Solution {
    public int missingInteger(int[] nums) {
        int n = nums.length;

        boolean[] hash = new boolean[1276];

        int Sum = nums[0];

        //populating hashTable
        for(int i = 0; i < n; i++){
            hash[nums[i]] = true;
        }

        //finding longest Prefix Sequential Sum
        for(int i = 1;
            i < n && nums[i] == nums[i - 1] + 1;
            Sum += nums[i++]);

        //finding the missing number using ht
        while(hash[Sum])
            Sum++;
            

        return Sum;
    }
}