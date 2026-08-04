class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> res = new ArrayList<>();
        
        boolean[] arr = new boolean[101];

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i : nums){
            min = Math.min(min, i);
            max = Math.max(max, i);
            arr[i] = true;
        }

        for(int i = min; i <= max; i++){
            if(!arr[i]){
                res.add(i);
            }
        }

        return res;
    }
}