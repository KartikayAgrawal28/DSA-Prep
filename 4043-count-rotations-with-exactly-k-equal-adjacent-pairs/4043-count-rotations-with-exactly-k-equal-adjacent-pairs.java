class Solution {
    public int countRotations(String s, int k) {
        int n = s.length();
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == s.charAt((i + 1) % n)) {
                count++;
            }
        }
        int result = 0;

        for (int i = 0; i < n; i++) {
            int score = count;
            if (s.charAt(i) == s.charAt((i + 1) % n)) {
                score--;
            }
            if (score == k) {
                result++;
            }
        }
        return result;
    }
}