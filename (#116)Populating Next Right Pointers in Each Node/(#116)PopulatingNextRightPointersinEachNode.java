public class Solution {
    public void connect(TreeLinkNode root) {
        
        TreeLinkNode point = root;
        
        while(point != null){
            
            TreeLinkNode start = point;
            
            while(start != null){
                
                if(start.left != null) start.left.next = start.right;
                
                if(start.right != null && start.next != null) start.right.next = start.next.left;
                
                start = start.next;
                
            }
            point = point.left;

        }
    }
}