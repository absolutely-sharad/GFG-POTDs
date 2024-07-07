class Solution {

     ArrayList<Integer> ans;
    void help(Node root,int target,ArrayList<Integer> temp){
        if(root==null)return;
        if(root.data==target){
            ans.addAll(temp);
            return;
        }
        temp.add(root.data);
        help(root.left,target,temp);
        help(root.right,target,temp);
        temp.remove(temp.size()-1);
    }
    public ArrayList<Integer> Ancestors(Node root, int target) {
        // add your code here
        ans = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();
        help(root,target,temp);
        Collections.reverse(ans);
        return ans;
    }
}
