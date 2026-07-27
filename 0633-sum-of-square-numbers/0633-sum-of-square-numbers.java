class Solution {
    public boolean judgeSquareSum(int c) {
        if(c<=1) return true;
        
        long left=0;

        long right=(int)Math.sqrt(c);
        
        
        
        while(right>=left){
            long sum = (left*left) + (right*right);
            
            if(sum==c) return true;
    
            else if(sum>c) right--;

            else left++;

        }
        return false;
    }
}