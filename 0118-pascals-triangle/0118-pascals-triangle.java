class Solution {
    public List<List<Integer>> generate(int numRows) {
        ArrayList<List<Integer>> pascal =new ArrayList<>();

        for(int i=0;i<numRows; i++){
        
            ArrayList<Integer> row = new ArrayList<>();
        
            int val=1;
        
            for (int j=0; j<=i;j++){
                row.add(val);
                val=val* (i-j)/(j+1);
            }
        
            pascal.add(row);
        }
        
        return pascal;
    }
}