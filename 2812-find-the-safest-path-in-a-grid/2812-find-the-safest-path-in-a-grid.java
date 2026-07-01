import java.util.*;

class Solution {

    private final int[][] directions = {
        {1, 0}, {-1, 0}, {0, 1}, {0, -1}
    };

    public int maximumSafenessFactor(List<List<Integer>> grid) {

        int size = grid.size();
        int[][] safety = new int[size][size];

        for (int[] row : safety) {
            Arrays.fill(row, -1);
        }

        Queue<int[]> bfsQueue = new LinkedList<>();

        // Start BFS from every thief
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                if (grid.get(row).get(col) == 1) {
                    safety[row][col] = 0;
                    bfsQueue.offer(new int[]{row, col});
                }
            }
        }

        while (!bfsQueue.isEmpty()) {

            int[] cell = bfsQueue.poll();
            int row = cell[0];
            int col = cell[1];

            for (int[] move : directions) {

                int newRow = row + move[0];
                int newCol = col + move[1];

                if (newRow >= 0 && newRow < size &&
                    newCol >= 0 && newCol < size &&
                    safety[newRow][newCol] == -1) {

                    safety[newRow][newCol] = safety[row][col] + 1;
                    bfsQueue.offer(new int[]{newRow, newCol});
                }
            }
        }

        int left = 0;
        int right = 2 * size;
        int answer = 0;

        while (left <= right) {

            int safeness = left + (right - left) / 2;

            if (isPathPossible(safety, safeness)) {
                answer = safeness;
                left = safeness + 1;
            } else {
                right = safeness - 1;
            }
        }

        return answer;
    }

    private boolean isPathPossible(int[][] safety, int minimumSafeValue) {

        int size = safety.length;

        if (safety[0][0] < minimumSafeValue) {
            return false;
        }

        boolean[][] visited = new boolean[size][size];
        Queue<int[]> queue = new LinkedList<>();

        queue.offer(new int[]{0, 0});
        visited[0][0] = true;

        while (!queue.isEmpty()) {

            int[] current = queue.poll();

            if (current[0] == size - 1 && current[1] == size - 1) {
                return true;
            }

            for (int[] move : directions) {

                int newRow = current[0] + move[0];
                int newCol = current[1] + move[1];

                if (newRow >= 0 && newRow < size &&
                    newCol >= 0 && newCol < size &&
                    !visited[newRow][newCol] &&
                    safety[newRow][newCol] >= minimumSafeValue) {

                    visited[newRow][newCol] = true;
                    queue.offer(new int[]{newRow, newCol});
                }
            }
        }

        return false;
    }
}