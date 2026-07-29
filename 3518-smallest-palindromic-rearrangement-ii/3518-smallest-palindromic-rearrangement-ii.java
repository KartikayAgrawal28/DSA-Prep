class Solution {
    private static final long LIMIT = 1_000_000L;

    public String smallestPalindrome(String s, int k) {
        int[] half = new int[26];
        StringBuilder mid = new StringBuilder();

        for (char c : s.toCharArray()) {
            half[c - 'a']++;
        }

        int halfLen = 0;
        for (int i = 0; i < 26; i++) {
            if ((half[i] & 1) == 1) {
                mid.append((char) ('a' + i));
            }
            half[i] /= 2;
            halfLen += half[i];
        }

        if (countWays(half) < k) {
            return "";
        }

        StringBuilder left = new StringBuilder();

        for (int pos = 0; pos < halfLen; pos++) {
            for (int c = 0; c < 26; c++) {
                if (half[c] == 0) continue;

                half[c]--;

                long cnt = countWays(half);

                if (cnt >= k) {
                    left.append((char) ('a' + c));
                    break;
                }

                k -= cnt;
                half[c]++;
            }
        }

        String right = new StringBuilder(left).reverse().toString();
        return left.toString() + mid + right;
    }

    private long countWays(int[] freq) {
        int remaining = 0;
        for (int x : freq) remaining += x;

        long ans = 1;

        for (int x : freq) {
            if (x == 0) continue;

            ans *= comb(remaining, x);
            if (ans > LIMIT) return LIMIT;

            remaining -= x;
        }

        return Math.min(ans, LIMIT);
    }

    private long comb(int n, int r) {
        if (r > n) return 0;
        r = Math.min(r, n - r);

        long res = 1;

        for (int i = 1; i <= r; i++) {
            res = res * (n - r + i) / i;
            if (res > LIMIT) return LIMIT;
        }

        return Math.min(res, LIMIT);
    }
}