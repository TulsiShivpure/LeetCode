class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        List<Integer> rows = new ArrayList<>();
        List<Integer> cols = new ArrayList<>();
        
        // Find all positions with zero
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(matrix[i][j] == 0) {
                    rows.add(i);
                    cols.add(j);
                }
            }
        }
        
        // Set entire rows to zero
        for(int row : rows) {
            for(int j = 0; j < n; j++) {
                matrix[row][j] = 0;
            }
        }
        
        // Set entire columns to zero
        for(int col : cols) {
            for(int i = 0; i < m; i++) {
                matrix[i][col] = 0;
            }
        }
    }
}