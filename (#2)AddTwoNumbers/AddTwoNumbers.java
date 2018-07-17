class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        if(l1 == null) return l2;
        if(l2 == null) return l1;
        ListNode res = new ListNode(0);
        ListNode point = res;
        int carry = 0;
        while(l1 != null || l2 != null){
            if(l1 != null){
                carry += l1.val;
                l1 = l1.next;
            }
            if(l2 != null){
                carry += l2.val;
                l2 = l2.next;
            }
            point.next = new ListNode(carry % 10);
            carry /= 10;
            point = point.next;
        }
        if(carry != 0)
            point.next = new ListNode(carry);
        return res.next;
    }
}