class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;

        // initialise new array;

        int[] ans = new int[n];

        // pos = postive index and neg = negative index
        int pos=0, neg=1;

        for(int i:nums){
            if(i>=0){
                ans[pos] = i;
                pos+=2;
            }

            else{
                ans[neg] = i;
                neg+=2;
            }
        }

        return ans;
    }
}