package practice.coding.list;

public class ReverseLinkedList {

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        public ListNode(int val) {
            this.val = val;
            this.next = null;
        }

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static ListNode reverseLinkedList(ListNode head) {
        ListNode prev = null;
        ListNode tmpNextHead = head.next;
        while(head != null ) {
            head.next = prev;
            prev = head;
            head = head.next;
        }
        return head;
    }
}
