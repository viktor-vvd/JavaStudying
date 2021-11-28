public class Ex6 {
    public static void main(String[] args) throws Exception {
        ListNode h1 = null;
        ListNode t1 = null;
        for (int i = 1; i < 6; i++) {
            ListNode l1 = new ListNode(i);
            if (h1 == null) {
                h1 = l1;
                t1 = l1;
            } else {
                t1.next = l1;
                t1 = l1;
            }
        }

        dispNode(h1);

        System.out.println("//");
        h1 = (new Solution()).removeNthFromEnd(h1, 2);

        dispNode(h1);
    }

    public static void dispNode(ListNode h1)
    {
        ListNode l1 = h1;    
        if(h1 == null) {    
            System.out.println("empty");    
            return;    
        }    
        while(l1 != null) {    
            System.out.println(l1.val);    
            l1 = l1.next;    
        }   
    }

}