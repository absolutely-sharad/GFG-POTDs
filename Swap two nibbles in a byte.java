// 31st May 2024
// Difficulty - Easy
// Topic Tags - Bit Magic & Data Structures
// Asked in the companies like - Accolite, Samsung, Cisco & Qualcomm

class Solution {
    static int swapNibbles(int n) {
         return (n&0x0F)<<4 | (n>>4);
    }
}

// Time Complexity:- O(1)
// Space Complexity:- O(1)
