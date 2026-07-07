class Solution {
    public long sumAndMultiply(int n) {
        long sum = 0;
        long x=0;
        long pow=1;
        while(n>0){
            int i=n%10;
            sum+=i; 
            if(i>0){
                x+= i*pow; 
                pow*=10;
            }
            n/=10;
        }
        return sum*x;
    }
}