package LinkedList.java;

public class MaximumTwinSumOfaLinkedList {
    public ListNode findMid(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    public ListNode reverse(ListNode head) {
        ListNode temp = head;
        ListNode curr = null;
        ListNode prev;
        while (temp != null) {
            prev = curr;
            curr = temp;
            temp = temp.next;
            curr.next = prev;
        }
        return curr;
    }

    public int pairSum(ListNode head) {
        ListNode mid = findMid(head);
        ListNode midhead = reverse(mid);

        ListNode temp1 = head;
        ListNode temp2 = midhead;

        int ans = (int) (-1e9);
        while (temp1 != null && temp2 != null) {
            int temp = temp1.val + temp2.val;
            ans = Math.max(ans, temp);
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        return ans;
    }
}
