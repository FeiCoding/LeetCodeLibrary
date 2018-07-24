/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<TreeNode> generateTrees(int n) {
        return helper(1, n);
    }
    
    private List<TreeNode> helper(int min, int max){
        List<TreeNode> res = new ArrayList<TreeNode>();
        if(min > max) return res;
        
        for(int rt = min; rt <= max; rt++){
            List<TreeNode> leftList = helper(min, rt - 1);
            List<TreeNode> rightList = helper(rt + 1, max);
            
            if(leftList.size() == 0 && rightList.size() == 0){ 
                TreeNode root = new TreeNode(rt);
                res.add(root);
            }
            else if(leftList.size() == 0){
                for(TreeNode node : rightList){
                    TreeNode root = new TreeNode(rt);
                    root.right = node;
                    res.add(root);
                }
            }
            else if(rightList.size() == 0){
                for(TreeNode node : leftList){
                    TreeNode root = new TreeNode(rt);
                    root.left = node;
                    res.add(root);
                }
            }
            else{
               for(TreeNode right : rightList){
                   for(TreeNode left : leftList){
                        TreeNode root = new TreeNode(rt);
                        root.right = right;
                        root.left = left;
                        res.add(root);
                   }
                } 
            }
        }
        
        return res;
    }
}