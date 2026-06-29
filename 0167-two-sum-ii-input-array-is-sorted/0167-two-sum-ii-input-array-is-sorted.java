class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        // New Array to store result
        int[] result = new int[2];

        // initialise pointer i and j
        // i pointer from left and j from right
        int i = 0, j = numbers.length-1;
        int sum = 0;

        /* 1st loop to check if the index 0 and 1 ka sum target hai to \
         usko answer array me daalo*/
        while(i<j){
            sum = numbers[i]+numbers[j];
            if(sum == target){
                result[0] = i+1;
                result[1] = j+1;
                break;
            } 

            // 
            else if(sum<target){
                i++;
            }
            else{
                j--;
            }
        }
        return result;
    }
}