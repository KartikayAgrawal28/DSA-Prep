import java.util.*;

class Solution {
    public int[] arrayRankTransform(int[] arr) {
        // clone the given array
        int[] sortedarr = arr.clone();
        
        // sort the new array 
        Arrays.sort(sortedarr);

        // initialise the haspmap
        Map<Integer, Integer> ranks = new HashMap<>();
        int rank = 1;
        for (int x : sortedarr) {
            if (!ranks.containsKey(x)) {
                ranks.put(x, rank);
                rank++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ranks.get(arr[i]);
        }
        return arr;
    }
}