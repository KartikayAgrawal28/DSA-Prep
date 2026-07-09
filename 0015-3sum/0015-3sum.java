class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // sort the array
        Arrays.sort(nums);


        // to make a new ArrayList to store values
        ArrayList<List<Integer>> res = new ArrayList<>();

        int n = nums.length; 

        

        for(int i=0; i<n-2; i++){
            
            //check if the number is used previously in the triplet to avoid duplicates
            if(i>0 && nums[i]==nums[i-1]) continue;

            int l = i+1, r = n-1; // initialise of the left and right pointers
            
            while(l<r){
                int sum = nums[i] + nums[l] + nums[r]; 

                if(sum == 0){
                    //store value in form of triplets in ArrayList
                    res.add(Arrays.asList(nums[i],nums[l],nums[r]));

                    // to skip the remaining same value for j to avoid duplicate triplets
                    while(l<r && nums[l]==nums[l+1]) l++;

                    // to skip the remaining same values for r to avoid duplicate triplets
                    while(l<r && nums[r]==nums[r-1]) r--;

                    //increase or decrease the pointer one time manually for new number 
                    l++;
                    r--;
                }

                else if(sum>0){
                    // to decrease the sum of triplets decrease the value of r pointer
                    r--;
                }

                else{ // sum<0 i.e negative
                    // to increase the sum of the triplet increase the vale of l pointer 
                    l++;
                }
            }
        } 
        return res;
    }
}