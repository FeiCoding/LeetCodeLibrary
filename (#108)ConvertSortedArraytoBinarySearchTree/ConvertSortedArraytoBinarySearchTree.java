class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length == 0) return null;
        TreeNode tree = helper(nums, 0, nums.length - 1);
        return tree;
    }
    
    public TreeNode helper(int nums[], int left, int right){
        if(left > right) return null;
        int mid = (left + right) / 2;
        TreeNode tree = new TreeNode(nums[mid]);
        tree.left = helper(nums, left, mid - 1);
        tree.right = helper(nums, mid + 1, right);
        return tree;
    }
}

