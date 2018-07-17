class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length == 0) return null;
        PriorityQueue<ListNode> queue = new PriorityQueue<ListNode>(lists.length, (o1, o2) -> o1.val - o2.val);
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;
        
        for(ListNode node : lists){
            if(node != null)
                queue.add(node);
        }
        while(!queue.isEmpty()){
            cur.next = queue.poll();
            cur = cur.next;
            if(cur.next != null)
                queue.add(cur.next);
        }
        return dummy.next;
    }
}