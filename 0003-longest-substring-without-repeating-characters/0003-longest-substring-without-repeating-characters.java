class Solution {
    public int lengthOfLongestSubstring(String s) {
        int ans = 0;
        int left = 0;

        HashMap<Character,Integer> map = new HashMap<>();

        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);

            // if char already seen, move left pointer after its last occurrence
            if (map.containsKey(ch)) {
                left = Math.max(left, map.get(ch) + 1);
            }

            map.put(ch, right);
            ans = Math.max(ans, right - left + 1);
        }

        return ans;
    }
}