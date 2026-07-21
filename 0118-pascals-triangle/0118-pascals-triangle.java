class Solution {
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> pascal = new ArrayList<List<Integer>>();

        List<Integer> row = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {

            row.add(0, 1);
            for (int j = 1; j < row.size() - 1; j++) {

                row.set(j, row.get(j) + row.get(j + 1)); // row.set(index, value)
            }
            pascal.add(new ArrayList<>(row));

        }

        return pascal;

    }
}