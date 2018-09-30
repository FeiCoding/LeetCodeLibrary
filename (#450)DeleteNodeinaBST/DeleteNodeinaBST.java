class Solution {
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root == null) return root;
        if(root.val == key){
            if(root.left == null) return root.right;
            if(root.right == null) return root.left;
            TreeNode succ = findSucessor(root);
            root.val = succ.val;
            root.right = deleteNode(root.right, succ.val);
            return root;
        }
        else if(root.val < key){
            root.right = deleteNode(root.right, key);
        }
        else{
            root.left = deleteNode(root.left, key);
        }
        return root;

    }
    
    private TreeNode findSucessor(TreeNode node){
        TreeNode cur = node.right;
        while(cur != null && cur.left != null){
            cur = cur.left;
        }
        return cur;
    }
    
}