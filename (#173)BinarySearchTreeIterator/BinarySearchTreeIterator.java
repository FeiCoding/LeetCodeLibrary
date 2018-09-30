public class BSTIterator {
    
    private Stack<TreeNode> stack = new Stack<>();
    
    public BSTIterator(TreeNode root) {
        pushNode(root);
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return !stack.isEmpty();
    }

    /** @return the next smallest number */
    public int next() {
        TreeNode node = stack.pop();
        pushNode(node.right);
        return node.val;
    }
    
    private void pushNode(TreeNode root){
        while(root != null){
            stack.push(root);
            root = root.left;
        }
    }
}