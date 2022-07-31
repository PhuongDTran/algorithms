import java.util.ArrayList;
import java.util.List;

public class ListNode {
    int value;
    ListNode next;

    public ListNode(int value) {
        this(value, null);
    }

    public ListNode(int value, ListNode next) {
        this.value = value;
        this.next = next;
    }

    public static ListNode convertArrayToListNode(int[] lst) {
        ListNode listNode = new ListNode(-1);
        ListNode runner = listNode;
        for (int e : lst) {
            runner.next = new ListNode(e);
            runner = runner.next;
        }
        return listNode.next;
    }

    public static int[] convertListNodeToArray(ListNode head) {
        List<Integer> lst = new ArrayList<>();
        while (head != null) {
            lst.add((head.value));
            head = head.next;
        }
        return lst.stream().mapToInt(Integer::intValue).toArray();
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
