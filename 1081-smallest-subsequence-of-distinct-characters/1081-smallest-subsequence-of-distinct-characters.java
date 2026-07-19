class Solution {
    public String smallestSubsequence(String s) {
        int[] count = new int[26];
        for (char c : s.toCharArray()){
            count[c - 'a']++;
        } 

        boolean[] inStack = new boolean[26];
        Deque<Character> stack = new ArrayDeque<>();

        for (char c : s.toCharArray()) {
            count[c - 'a']--;
            if (inStack[c - 'a']) continue;

            while (!stack.isEmpty() && stack.peek() > c && count[stack.peek() - 'a'] > 0) {
                inStack[stack.pop() - 'a'] = false;
            }

            stack.push(c);
            inStack[c - 'a'] = true;
        }

        StringBuilder sb = new StringBuilder();
        for (char c : stack) sb.append(c);
        return sb.reverse().toString();
    }
}