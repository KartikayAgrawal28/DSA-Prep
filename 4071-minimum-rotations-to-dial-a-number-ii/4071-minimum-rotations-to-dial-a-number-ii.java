class Solution {

    public int minRotations(int n, String s) {

        int total = cost(0, s.charAt(0) - '0');

        for (int i = 1; i < n; i++) {
            total += cost(s.charAt(i - 1) - '0',
                          s.charAt(i) - '0');
        }

        int ans = total;

        for (int k = 0; k < n; k++) {

            int prev = (k == 0) ? 0 : s.charAt(k - 1) - '0';
            int oldDigit = s.charAt(k) - '0';
            int lastDigit = s.charAt(n - 1) - '0';

            int newTotal = total
                    - cost(prev, oldDigit)
                    + cost(prev, lastDigit);

            ans = Math.min(ans, newTotal);
        }

        return ans;
    }

    private int cost(int a, int b) {
        int diff = Math.abs(a - b);
        return Math.min(diff, 10 - diff);
    }
}