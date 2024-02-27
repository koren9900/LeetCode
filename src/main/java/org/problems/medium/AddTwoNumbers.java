package org.problems.medium;

public class AddTwoNumbers {
     class ListNode {
         int val;
         ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode la = new ListNode(0);
        ListNode cur = la;
        int carry = 0;
        while(true){
            int sum = carry;
            if(l1 != null){
                sum += l1.val;
                l1 = l1.next;
            }
            if(l2 != null){
                sum += l2.val;
                l2 = l2.next;
            }
            cur.val = sum%10;
            carry = sum/10;


            if(l1 != null || l2 != null || carry != 0) {
                cur.next = new ListNode(0);
                cur = cur.next;
            }
            else break;
        }
        return la;
    }
}
