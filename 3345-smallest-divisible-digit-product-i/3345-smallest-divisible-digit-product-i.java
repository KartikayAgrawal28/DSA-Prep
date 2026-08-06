class Solution {
    public int smallestNumber(int n, int t) {
        
        
       for(int i=n;i<101;i++){  // constaint  1<= n <= 100
        int prod=1;
        int temp=i;
        
        while(temp>0){
            prod *= temp%10;
            temp /= 10;
        }

        if(prod % t == 0) return n;

        n++;
       }
       return 0;
    }
}