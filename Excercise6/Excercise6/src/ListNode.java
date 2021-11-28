public class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (n <= 0)
            return null;
        ListNode p1 = head;
        ListNode p2 = head;

        for (int i = 0; i < n - 1; i++) {
            if (p2 == null)
                return null;
            p2 = p2.next;
        }
        if (p2 == null)
            return null;

        while (p2.next != null) {
            p1 = p1.next;
            p2 = p2.next;
        }

        p2 = head;
        while (p2.next != p1) 
        {
          p2 = p2.next;
        }
        p2.next = p1.next;
        return head;
    }
}
