public class Solution {
    public void connect(TreeLinkNode root) {
        while(root != null){
            TreeLinkNode start = new TreeLinkNode(0);
            TreeLinkNode pointer = start;
            while(root != null){
                if(root.left != null){
                    pointer.next = root.left;
                    pointer = pointer.next;
                }
                if(root.right != null){
                    pointer.next = root.right;
                    pointer = pointer.next;
                }
                root = root.next;
            }
            root = start.next;
        }
    }
}