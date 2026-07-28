class Solution {
    public String smallestPalindrome(String s) {
        int[] freq = new int[26];

        // Count frequency of each character
        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }

        StringBuilder left = new StringBuilder();
        char middle = 0;

        // Build left half in lexicographical order
        for (int i = 0; i < 26; i++) {
            while (freq[i] >= 2) {
                left.append((char) ('a' + i));
                freq[i] -= 2;
            }

            if (freq[i] == 1) {
                middle = (char) ('a' + i);
            }
        }

        StringBuilder ans = new StringBuilder();
        ans.append(left);

        if (middle != 0) {
            ans.append(middle);
        }

        ans.append(new StringBuilder(left).reverse());

        return ans.toString();
    }
}