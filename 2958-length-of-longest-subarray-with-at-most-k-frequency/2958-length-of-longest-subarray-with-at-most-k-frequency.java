class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();

        int left=0;
        int ans=0;

        for(int right=0;right<nums.length;right++){

            // inc the freuency 
            map.put(nums[right] , map.getOrDefault(nums[right],0)+1);

            //if freq of element > k
            while(map.get(nums[right])>k){
                map.put(nums[left] , map.get(nums[left])-1);
                left++;
            }
            //
            ans = Math.max(ans , right-left+1);
        } 
        return ans;
    }
}