public class LoopInLinkedList {
    private ListNode head;

    private class ListNode {
        private int val;
        private ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    private void createLoop() {
        this.head = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        ListNode n5 = new ListNode(5);
        ListNode n6 = new ListNode(6);
        ListNode n7 = new ListNode(7);

        head.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        n6.next = n7;

        n7.next = n4;
    }

    public static void main(String[] args) {
        var list = new LoopInLinkedList();

    }

}