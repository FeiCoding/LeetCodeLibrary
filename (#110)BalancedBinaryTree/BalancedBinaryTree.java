class Solution {
    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;
        return helper(root) != -1;
    }
    private int helper(TreeNode root){
        if(root == null) return 0;
        int lH = helper(root.left);
        if(lH == -1) return -1;
        int rH = helper(root.right);
        if(rH == -1) return -1;
        if(lH - rH > 1 || lH - rH < -1)
            return -1;
        return Math.max(lH, rH) + 1;
    }
}