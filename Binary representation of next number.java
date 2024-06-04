// 4th June 2024
// Difficulty - Easy
// Topic Tags - Bit Magic & Data Structures

class Solution {
    String binaryNextNumber(String s) {
        boolean indication=true;
        char[] temp = s.toCharArray();
        for(int i=s.length()-1;i>=0;i--){
            if(temp[i]=='0'){
                temp[i]='1';
                indication=false;
                break;
            }
            else temp[i]='0';
        }
        StringBuilder ans = new StringBuilder();
        if(indication==true){
            ans.append('1');
            ans.append(temp);
        }
        else{
            int index=0;
            while(index<s.length() && temp[index]=='0')index++;
            ans.append(temp,index,s.length()-index);
        }
        return ans.toString();
    }
