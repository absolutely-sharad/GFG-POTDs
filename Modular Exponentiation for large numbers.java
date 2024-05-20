// 19th May 2024
// Difficulty - Medium
// Topic Tags -Divide and Conquer, Binary Search, Algorithms, number-theory, Mathematical & Modular Arithmetic
// Asked in the companies like - Amazon, Google and so on

class Solution
{
    public long PowMod(long x, long n, long m)
    {
        // Code here
        long ans =1;
	    while(n>0){
	        if(n%2==1)ans=(ans*x)%m;
	        x=(x*x)%m;
	        n/=2;
	    }
	    return ans;
    }
}
