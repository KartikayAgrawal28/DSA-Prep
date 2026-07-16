class Solution {
    public long gcdSum(int[] nums) {
        
        int n = nums.length;

        int[] prefixGcd = new int[n];

        int mx1 = 0;

        for(int i=0;i<n;i++){
            mx1 = Math.max(mx1, nums[i]);

            prefixGcd[i] = GCD(nums[i], mx1);
        }

        //sort the array
        Arrays.sort(prefixGcd);

        long sumGcd = 0; // to avoid integer overflow we use long here instead of int
        
        // by two pointer make subarray for points

        int left = 0;
        int right = n-1;

        while(left<right){
            sumGcd+= GCD(prefixGcd[left], prefixGcd[right]);

            left++;
            right--;
        } 

        return sumGcd;
    }

    public int GCD(int a , int b){
        // by Euclidean algo for gcd

        while(b!=0){
            int temp = b;
            b=a%b;
            a=temp;
        }
        return a;
    }
}