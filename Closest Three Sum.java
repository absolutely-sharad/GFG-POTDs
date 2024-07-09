// 9th July 2024
// Difficulty - Medium
// Topic Tags - Arrays, Hash, Data Structures, two-pointer-algorithm
// Asked in the companies like - Amazon, Microsoft, Google & Apple

class Solution {
   static int threeSumClosest(int[] array, int target) {
        // code here
        int diff=Integer.MAX_VALUE,ans=0;
        Arrays.sort(array);
        for(int i=0;i<array.length-2;i++){
            int j=i+1,k=array.length-1;
            while(j<k){
                int sum=array[i]+array[j]+array[k];
                int d = Math.abs(sum-target);
                if(d<diff){
                    diff=d;
                    ans=sum;
                }
                else if(d==diff){
                    ans=Math.max(ans,sum);
                }
                if(sum<target)j++;
                else if(sum==target)return sum;
                else k--;
            }
        }
        return ans;
    }
}
// Time Complexity:- O(N^2)
// Space Complexity:- O(1)
