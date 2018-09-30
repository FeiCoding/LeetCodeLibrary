class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(preorder.length == 0 || inorder.length == 0)
            return null;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < inorder.length; i++){
            map.put(inorder[i], i);
        }
        return helper(preorder, inorder, 0, 0, preorder.length - 1, inorder.length - 1, map);
    }
    
    private TreeNode helper(int[] preorder, int[] inorder, int prestart, int instart, int preend, int inend, HashMap<Integer, Integer> map){
        if(prestart > preend || instart > inend) return null;
        TreeNode root = new TreeNode(preorder[prestart]);
        int index = map.get(root.val);
        root.left = helper(preorder, inorder, prestart + 1, instart, prestart + 1 + index - instart - 1, index - 1, map);
        root.right = helper(preorder, inorder, prestart + 1 + index - instart, index + 1, preend, inend, map);
        return root;
    }
}