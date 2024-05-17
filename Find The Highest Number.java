// 18th May 2024
// Difficulty - Easy
// Data Structure - Array
// Topics - Binary Search & Algorithms
// Asked in the companies like - Amazon

// Two-pointer approach
class Solution{
  public int findPeakElement(List<Integer> a) {
        int left = 0;  // Initialize left pointer
        int right = a.size() - 1;  // Initialize right pointer

        // Perform binary search
        while (left < right) {
            int mid = left + (right - left) / 2;  // Calculate mid index

            // Check if mid element is greater than the next element
            if (a.get(mid) > a.get(mid + 1)) {
                // If yes, the peak must be on the left side (including mid)
                right = mid;
            } else {
                // Otherwise, the peak must be on the right side (excluding mid)
                left = mid + 1;
            }
        }
        // Return the peak element found at the left pointer
        return a.get(left);
    }
}
