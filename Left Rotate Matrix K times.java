// 25th June 2024
// Difficulty - Medium
// Topic Tags - Matrix, Data Structures, Modular Arithmetic & Algorithms
// Asked in the companies like - Amazon

class Solution {
    public int[][] rotateMatrix(int k, int[][] mat) {
        // code here
        int n = mat.length, m = mat[0].length;
        int[][] ans = new int[n][m];
        k %= m;
        if (k == 0) return mat;
        for (int i = 0; i < n; i++) {
            int x = 0;
            for (int j = k; j < m; j++, x++) {
                ans[i][x] = mat[i][j];
            }
            for (int j = 0; j < k; j++, x++) {
                ans[i][x] = mat[i][j];
            }
        }
        return ans;
    }
}
