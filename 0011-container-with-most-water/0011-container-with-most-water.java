class Solution {
    public int maxArea(int[] height) {

        //Approach 1 brute force but it exceeds the time limit caz TC is O(n2)
        // int max=0;
        // int n = height.length;
        // for(int i=0;i<n-1;i++){
        //     for(int j=i+1;j<n;j++){
        //         int length = Math.min(height[i],height[j]);
        //         int width = j-i;
        //         int area = length*width;
        //         max = Math.max(area,max);
        //     }
        // }
        // return max;


        // approach 2 optimised way 

        int max = 0;
        int n = height.length;
        
        int left = 0, right = n-1;

        while(left<right){
            int length = Math.min(height[left], height[right]);
            int breadth = right - left ;
            int area = length * breadth;
            max = Math.max(area,max);

            if(height[left] < height[right]){
                left++;
            } 
            else right--;
        }
        return max;








    }
}