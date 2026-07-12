class Solution {

    public void reverse(int[] nums, int left, int right) {

        while (left < right) {

            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;

            left++;
            right--;
        }
    }

    public void rotate(int[] nums, int k) {

        int n = nums.length;

        k %= n;  // to avoid repeatation of rotation as it repeats itself after 1 whole cycle i.e after k rotates

        reverse(nums, 0, n - 1); // for whole array

        reverse(nums, 0, k - 1); // for until k

        reverse(nums, k, n - 1); // for remaining array
    }
}