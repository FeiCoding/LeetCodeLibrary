class KthLargest {
    private int k;
    private TreeNode root;
    
    public KthLargest(int k, int[] nums) {
        this.k = k;
        for(int i : nums) 
            root = buildTree(root, i);
    }
    
    
    public int add(int val) {
        root = buildTree(root, val);
        return findK();
    }
    
    private int findK(){
        TreeNode node = root;
        int count = k;
        while(count > 0){
            int pos = 1 + (node.right == null ? 0 : node.right.count);
            if(pos == count) break;
            if(pos > count)
                node = node.right;
            else {
                node = node.left;
                count -= pos;
            }
        }
        return node.val;
    }
    
    private TreeNode buildTree(TreeNode root, int num){
        if(root == null){
            root = new TreeNode(num);
            return root;
        }
        root.count++;
        if(num > root.val)
            root.right = buildTree(root.right, num);
        else root.left = buildTree(root.left, num);
        return root;    
    }
    class TreeNode{
        int val;
        int count = 1;
        TreeNode left, right;
        
        public TreeNode(int val){
            this.val = val;
        }
    }
}