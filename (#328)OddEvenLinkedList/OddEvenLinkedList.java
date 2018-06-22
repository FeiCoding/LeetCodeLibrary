class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head == null) return head;
        ListNode head2 = head.next;
        ListNode odd = head;
        ListNode even = head2;
        while(even != null && even.next != null){
            odd.next = odd.next.next;
            odd = odd.next;
            even.next = even.next.next;
            even = even.next;
        }
        odd.next = head2;
        return head;
    }
}