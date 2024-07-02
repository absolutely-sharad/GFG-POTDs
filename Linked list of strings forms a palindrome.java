// 2nd July 2024
// Difficulty - Easy
// Topic Tags - Linked List, palindrome & Data Structures

class Solution {
     public boolean compute(Node root) {
        StringBuilder temp = new StringBuilder();
        while(root!=null){
            temp.append(root.data);
            root=root.next;
        }
        String concat = temp.toString();
        int i=0,j=concat.length()-1;
        while(i<j){
            if(concat.charAt(i)!=concat.charAt(j))return false;
            i++;
            j--;
        }
        return true;
    }
}

// Time Complexity:- O(N)
// Space Complexity:- O(N)
// Where N is total number of characters.
