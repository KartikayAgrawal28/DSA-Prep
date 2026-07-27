class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        //use hashmap to store frequency
        HashMap<Integer,Integer> map = new HashMap<>();

        long ans=0, sum=0;
        int left=0;

        for(int right=0;right<nums.length;right++){

            //expansion
            sum+= nums[right];
            map.put(nums[right] , map.getOrDefault(nums[right],0)+1);

            //keep window exact k
            if((right-left+1)>k){
                sum-=nums[left];

                //remove the repeated number freq from map
                map.put(nums[left] , map.get(nums[left])-1);

                //remove if freq=0
                if(map.get(nums[left])==0){
                    map.remove(nums[left]);
                }
                left++;
            }

            //checks for valid window
            // right-left+1=subaray size and map.size()=distinct character in map 
            if(right-left+1 == k && map.size()==k){ 
                ans = Math.max(ans,sum);
            }
        }
        return ans;

        


        
    }
}