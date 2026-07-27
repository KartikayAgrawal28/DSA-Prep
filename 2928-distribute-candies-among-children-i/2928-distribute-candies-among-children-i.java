class Solution {
    public int distributeCandies(int n, int limit) {
        int ans=0;

        // here i j k represnts child 1 2 3 respectively
        // caz hame 3 students me hi batna hai

        for(int i=0;i<=limit;i++){
            for(int j=0;j<=limit;j++){
                int k = n-i-j;

                if(k>=0 && k<=limit) ans++;
            }
        }
        return ans;
    }
}