// 14th June 2024
// Difficulty - Easy
// Topic Tags - Mathematical & Algorithmss
// Asked in the companies like - VMWare & Oracle

class Solution {
    static String armstrongNumber(int n){
        // code here
        int ans=0,temp=n;
        while(temp != 0){
            int digit=temp%10;
            ans+=digit*digit*digit;
            temp/=10;
        }
        return ans==n?"true":"false";
    }
}
