class Solution {
    public List<List<Integer>> generate(int n) {
        ArrayList<List<Integer>> pascal = new ArrayList<>();

        for(int i=0;i<n; i++){
        
            ArrayList<Integer> row = new ArrayList<>();
        
            int val=1;
        
            for (int j=0; j<=i;j++){
                row.add(val);
                val=val * (i-j)/(j+1);
            }
        
            pascal.add(row);
        }
        
        return pascal;
    }
}