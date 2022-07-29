import lombok.*;

@AllArgsConstructor
public class ListNode {
    int value;
    ListNode next;

    public static ListNode parseArrayToListNode(int[] lst) {
        ListNode listNode = new ListNode(-1, null);
        ListNode runner = listNode;
        for (int e : lst) {
            runner.next = new ListNode(e, null);
            runner = runner.next;
        }
        return listNode.next;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof ListNode) {
            ListNode otherLstNode = (ListNode) obj;
            return equalsHelper(this, otherLstNode);
        }
        return false;
    }

    private boolean equalsHelper(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null) {
            return true;
        }
        if (l1 == null || l2 == null) {
            return false;
        }
        if (l1.value != l2.value) {
            return false;
        }
        return equalsHelper(l1.next, l2.next);
    }
}
