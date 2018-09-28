class Solution {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if(inorder.length == 0 || postorder.length == 0)
            return null;
        int instart = 0;
        int poststart = 0;
        int inend = inorder.length - 1;
        int postend = postorder.length - 1;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int index = 0;
        for(int i = 0; i < inorder.length; i++){
            map.put(inorder[i], i);
        }
        return helper(inorder, instart, inend, postorder, poststart, postend, map);
    }
    private TreeNode helper(int[] inorder, int instart, int inend, int[] postorder, int poststart, int postend, HashMap<Integer, Integer> map){
        if(instart > inend || poststart > postend) return null;
        TreeNode root = new TreeNode(postorder[postend]);
        int index = map.get(postorder[postend]);
        TreeNode left = helper(inorder, instart, index - 1, postorder, poststart, poststart + index - instart - 1, map);
        TreeNode right = helper(inorder, index + 1, inend, postorder, poststart + index - instart, postend - 1, map);
        
        root.left = left;
        root.right = right;
        return root;
    }
}