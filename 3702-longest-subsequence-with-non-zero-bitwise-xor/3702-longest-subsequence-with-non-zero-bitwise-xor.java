class Solution {
    public int longestSubsequence(int[] nums) {
        int ans = 0, n = nums.length;
        boolean nonZero = false;

        for (int x : nums) {
            nonZero |= x > 0;
            ans ^= x;
        }

        if (!nonZero) return 0;
        return ans == 0 ? n - 1 : n;
    }
}