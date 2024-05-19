// 19th May 2024
// Difficulty - Easy
// Data Structure - Array
// Topic Tags - Algorithms, Arrays, Binary Search & Data Structures
// Asked in the companies like - Amazon, Google and so on

// Solved using Binary Search
class Solution {
    public static int findClosest(int n, int k, int[] arr) {
        int low = 0,high = n-1,mid = 0,min = Integer.MAX_VALUE,ans = -1;
        while(low <= high){
            mid = (low+high)/2;
            int diff = Math.abs(arr[mid]-k);
            if(diff <= min){
                if(diff == min){
                    ans = Math.max(ans,arr[mid]);
                }
                else{
                     ans = arr[mid];
                min = diff;
                }
            }
            if(arr[mid] <= k){
                low = mid+1;
            }
            else{ 
                high = mid-1;
            }
        }
        return ans;
    }
}
