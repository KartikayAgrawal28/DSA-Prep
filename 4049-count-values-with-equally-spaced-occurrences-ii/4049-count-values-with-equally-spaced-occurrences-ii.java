class Solution {
    public int countSpecialIntegers(int[] nums) {
        Map<Integer, List<Integer>> position = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            position.computeIfAbsent(nums[i] , k-> new ArrayList<>()).add(i);
            
        }

        int count=0;
        for(List<Integer> idx : position.values()){
            if(idx.size()<3) continue;

            int gap=idx.get(1) - idx.get(0);

            boolean equallySpaced = true;

            for(int i=2;i<idx.size();i++){
                if(idx.get(i) - idx.get(i-1) != gap){
                    equallySpaced = false;
                    break;
                }
            }
            if(equallySpaced) count++;
        }
        return count;
    }
}