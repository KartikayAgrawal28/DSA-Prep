class Solution {
    public int majorityElement(int[] nums) {
    
        Arrays.sort(nums);
        
        // Because the number when it is sorted the number at N/2 place will be the number which is more than n/2
        return nums[nums.length/2];
    }
}