class Solution {
    public char findTheDifference(String s, String t) {
        char result = 0;
        
        // to store the elements of sstring in a words 
        for (char c : s.toCharArray()) result ^= c; 

        // now apply xor operator int he character 
        // a^a= 0 so sam eelments will be eliminated and the one will remain int he varibale
        for (char c : t.toCharArray()) result ^= c;
        
        return result;
    }
}