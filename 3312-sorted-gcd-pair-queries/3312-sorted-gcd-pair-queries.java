class Solution {
    public int[] gcdValues(int[] nums, long[] queries) {

        int mx = 0;
        for (int x : nums)
            mx = Math.max(mx, x);

        int[] freq = new int[mx + 1];

        for (int x : nums)
            freq[x]++;

        long[] exact = new long[mx + 1];

        for (int g = mx; g >= 1; g--) {

            long cnt = 0;

            for (int j = g; j <= mx; j += g)
                cnt += freq[j];

            exact[g] = cnt * (cnt - 1) / 2;

            for (int j = g * 2; j <= mx; j += g)
                exact[g] -= exact[j];
        }

        long[] prefix = new long[mx + 1];

        for (int i = 1; i <= mx; i++)
            prefix[i] = prefix[i - 1] + exact[i];

        int[] ans = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {

            int l = 1;
            int r = mx;

            while (l < r) {

                int mid = l + (r - l) / 2;

                if (prefix[mid] > queries[i])
                    r = mid;
                else
                    l = mid + 1;
            }

            ans[i] = l;
        }

        return ans;
    }
}