package org.problems.easy;

public class MergeTwoSortedLists {
     public class ListNode {
         int val;
         ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode sorted = new ListNode(0);
        ListNode head = sorted;
         while(list1 != null && list2 != null) {
             if (list1.val < list2.val) {
                 head.next = new ListNode(list1.val);
                 list1 = list1.next;
             } else {
                 head.next = new ListNode(list2.val);
                 list2 = list2.next;
             }
             head = head.next;
         }
        if(list1 != null)
            head.next = list1;
        else head.next = list2;
        return sorted.next;
    }
}
