public class Codec {
    final String spliter = ",";
    final String NN = "x";
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        buildString(sb, root);
        return sb.toString();
    }
    
    private void buildString(StringBuilder sb, TreeNode root){
        if(root == null){
            sb.append(NN).append(spliter);
            return;
        }
        sb.append(root.val).append(spliter);
        buildString(sb, root.left);
        buildString(sb, root.right);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        Queue<String> queue = new LinkedList<String>();
        queue.addAll(Arrays.asList(data.split(spliter)));
        return buildTree(queue);     
    }
    
    private TreeNode buildTree(Queue<String> queue){
        String val = queue.poll();
        if(val.equals("x")) return null;
        else{
            TreeNode node = new TreeNode(Integer.valueOf(val));
            node.left = buildTree(queue);
            node.right = buildTree(queue);
            return node;
        }
    }
}
