class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> finalList = new ArrayList<List<Integer>>();
        int level = 0;
        traverse(finalList, root, level);
        return finalList;
    }
    
    public void traverse(List<List<Integer>> finalList, TreeNode root, int level){
        if(root == null) return;
        
        if(finalList.size() <= level)
            finalList.add(new ArrayList<Integer>());
        if(level % 2 == 0)
            finalList.get(level).add(root.val);
        else
            finalList.get(level).add(0, root.val);
        
        traverse(finalList, root.left, level + 1);
        traverse(finalList, root.right, level + 1);
    }
}