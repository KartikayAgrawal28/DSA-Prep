class Solution {
    public int uniqueXorTriplets(int[] nums) {
        int n = nums.length;

        if (n <= 2) return n;

        int triplet = 0;
        for (int num : nums) {
            triplet |= num;
        }

        return triplet + 1;
    }
}