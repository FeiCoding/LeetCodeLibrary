class Solution {
    int result = 0;
    int count = 0;
    public int kthSmallest(TreeNode root, int k) {
        traverse(root, k);
        return result;
    }
    
    public void traverse(TreeNode root, int k){
        if(root == null) return;
        traverse(root.left, k);
        count++;
        if(count == k) result = root.val;
        traverse(root.right, k);
    }
}
