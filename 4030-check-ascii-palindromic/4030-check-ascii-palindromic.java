class Solution {
    public boolean isPalindromic(String s) {
        StringBuilder str = new StringBuilder();

        for(char ch: s.toCharArray()){
            int ascii = (int) ch;

            for(int i=7;i>=0;i--){
                str.append((ascii>>i)&1);
            }
        }
        //two pointer for palindrome
        int left=0;
        int right = str.length()-1;

        while(left<right){
            if(str.charAt(left) != str.charAt(right)) return false;

            left++;
            right--;
        }
        return true;
    }
}