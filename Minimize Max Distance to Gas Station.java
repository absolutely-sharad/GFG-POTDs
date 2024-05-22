// 22nd May 2024
// Difficulty - Hard
// Topic Tags - Binary Search & Mathematical
// Asked in the companies like - Amazon, Google and so on

class Solution {
     static boolean isPossible(int stations[],double mid,int k){
        int total=0;
        for(int i=1;i<stations.length;i++){
            int dis = stations[i]-stations[i-1];
            total+=Math.ceil(dis/mid)-1;
        }
        return total<=k;
    }
    public static double findSmallestMaxDist(int stations[], int k) {
        int n = stations.length;
        double low=0,high=stations[n-1]-stations[0],mid=0,ans=0;
        ans=high;
        while(high-low>=1e-6){
            mid=(low+high)/2;
            if(isPossible(stations,mid,k)){
                ans=mid;
                high=mid;
            }
            else low=mid;
        }
        return ans;
    }
}
