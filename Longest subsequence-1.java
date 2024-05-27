// 27th May 2024
// Difficulty - Medium
// Topic Tags - Hashing, Data Structures & Algorithms
// Asked in the companies like - Flipkart

class Solution {
    public static int longestSubseq(int n, int[] a) {
        Map<Integer,Integer> mm = new HashMap<>();
        int ans=0;
        for(int i=0;i<n;i++){
            mm.put(a[i],1+Math.max(mm.getOrDefault(a[i]-1,0),mm.getOrDefault(a[i]+1,0)));
            ans=Math.max(ans,mm.get(a[i]));
        }
        return ans;
    }
}
