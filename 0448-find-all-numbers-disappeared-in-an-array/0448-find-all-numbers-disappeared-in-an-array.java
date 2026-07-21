class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {

        HashSet<Integer> set = new HashSet<>();
        List<Integer> res = new ArrayList<>();

        for (int num : nums) // place all the values in the hashset
            set.add(num);

        for (int i = 1; i <= nums.length; i++) {
            if (!set.contains(i))    // checks if the hash doessn't contain the value
                res.add(i);
        }

        return res;
    }
}