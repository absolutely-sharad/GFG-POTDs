// 28th June 2024
// Difficulty - Hard
// Topic Tags - Matrix, Functions, Data Structures & Algorithms

class Solution {
    public boolean palindrome(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            if (arr[i] != arr[n - 1 - i]) {
                return false;
            }
        }
        return true;
    }

    public String pattern(int[][] arr) {
        int n = arr.length;
        String ans = "-1";
        
        // Check rows
        for (int i = 0; i < n; i++) {
            int[] currRow = new int[n];
            for (int j = 0; j < n; j++) {
                currRow[j] = arr[i][j];
            }
            if (palindrome(currRow, n)) {
                ans = i + " R";
                return ans;
            }
        }
        
        // Check columns
        for (int j = 0; j < n; j++) {
            int[] currCol = new int[n];
            for (int i = 0; i < n; i++) {
                currCol[i] = arr[i][j];
            }
            if (palindrome(currCol, n)) {
                ans = j + " C";
                return ans;
            }
        }
        
        return ans;
    }
}
