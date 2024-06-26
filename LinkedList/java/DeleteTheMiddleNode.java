package LinkedList.java;

public class DeleteTheMiddleNode {
    public ListNode deleteMiddle(ListNode head) {
        if (head == null)
            return null;
        if (head.next == null)
            return null;

        ListNode slow = head;
        ListNode fast = head;

        ListNode prev = null;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            prev = slow;
            slow = slow.next;
        }

        prev.next = slow.next;
        return head;

    }
}
