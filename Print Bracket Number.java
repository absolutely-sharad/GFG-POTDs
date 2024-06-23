// 23rd June 2024
// Difficulty - Easy
// Topic Tags - Strings, Stack, Regular Expression & Data Structures
// Asked in the companies like - Flipkart

class Solution {
    ArrayList<Integer> bracketNumbers(String str) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        Stack<Integer> st = new Stack<>();
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='('){
                count++;
                ans.add(count);
                st.push(count);
            }
            else if(str.charAt(i)==')'){
                ans.add(st.peek());
                st.pop();
            }
        }
        return ans;
    }
};
