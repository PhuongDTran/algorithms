import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;


@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = false)
public class IterativeMergeSortedList {
    ListNode list1;
    ListNode list2;

    public IterativeMergeSortedList(int[] l1, int[] l2) {
        list1 = new ListNode(-1);
        list2 = new ListNode(-1);
        ListNode runner1 = list1;
        ListNode runner2 = list2;
        for(int v1 : l1) {
            runner1.next = new ListNode(v1);
            runner1 = runner1.next;
        }
        for(int v2 : l2) {
            runner2.next = new ListNode(v2);
            runner2 = runner2.next;
        }
        list1 = list1.next;
        list2 = list2.next;
    }

    public ListNode merge(){
        return mergeHelper(list1, list2);
    }

    private  ListNode mergeHelper(ListNode list1, ListNode list2) {
        ListNode prehead = new ListNode(-1);
        ListNode prev = prehead;
        while (list1 != null && list2 != null) {
            if (list1.value < list2.value) {
                prev.next = list1;
                list1 = list1.next;
            } else {
                prev.next = list2;
                list2 = list2.next;
            }
            prev = prev.next;
        }
        // at most one of list1 or list2 can still have nodes
        prev.next = list1 != null ? list1 : list2;
        return prehead.next;
    }
}