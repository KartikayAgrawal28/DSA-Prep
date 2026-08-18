class Solution {
    public int largestInteger(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        int n = nums.length;

        // Sliding window
        for (int i = 0; i <= n - k; i++) {

            HashSet<Integer> set = new HashSet<>();

            // Build current window
            for (int j = i; j < i + k; j++) {
                set.add(nums[j]);
            }

            // Each number gets +1 window
            for (int num : set) {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
        }

        int ans = -1;

        for (int num : map.keySet()) {
            if (map.get(num) == 1) {
                ans = Math.max(ans, num);
            }
        }

        return ans;
    }
}