class Solution {
    public int uniqueXorTriplets(int[] nums) {

        final int MAX = 2048; // max value that can be holdd

        boolean[] single = new boolean[MAX];
        boolean[] pair = new boolean[MAX];
        boolean[] ans = new boolean[MAX];

        int n = nums.length;

        for (int i = 0; i < n; i++) {

            // Current number alone
            single[nums[i]] = true;

            // Form pair XORs
            for (int x = 0; x < MAX; x++) {
                if (single[x]) {
                    pair[x ^ nums[i]] = true;
                }
            }

            // Form triplet XORs
            for (int x = 0; x < MAX; x++) {
                if (pair[x]) {
                    ans[x ^ nums[i]] = true;
                }
            }
        }

        int count = 0;
        for (boolean b : ans)
            if (b)
                count++;

        return count;
    }
}