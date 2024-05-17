// 17th May 2024
// Difficulty - Easy
// Topics - Sorting & Binary Search Algorithms
// Asked in the companies like - Amazon, Visa

//Brute Force code
class Solution {
    // Method to find a pair of elements with the absolute difference of x
    public int findPair(int n, int x, int[] arr) {
        // Outer loop to iterate through each element in the array
        for(int i = 0; i < n; i++) {
            // Inner loop to check each element after the current element
            for(int j = i + 1; j < n; j++) {
                // Check if the absolute difference between two elements is x
                if(Math.abs(arr[i] - arr[j]) == x)
                    // Return 1 if a pair is found
                    return 1;
            }
        }
        // Return -1 if no pair is found
        return -1;
    }
}


//Optimized code
class Solution {
    // Method to find a pair of elements with the absolute difference of x
    public int findPair(int n, int x, int[] arr) {
        // Create a HashSet to store the elements
        HashSet<Integer> pairs = new HashSet<>();
        // Iterate through each element in the array
        for(int i = 0; i < n; i++) {
            // Check if the set contains an element that differs by x
            if (pairs.contains(arr[i] - x) || pairs.contains(arr[i] + x)) 
                // Return 1 if such a pair is found
                return 1;
            else 
                // Add the current element to the set
                pairs.add(arr[i]);
        }
        // Return -1 if no pair is found
        return -1;
    }
}
