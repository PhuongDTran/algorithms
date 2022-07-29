import lombok.AllArgsConstructor;
import lombok.experimental.*;
import lombok.AccessLevel;

@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class IterativeMergeSortedList {
    ListNode list1;
    ListNode list2;

    public ListNode merge(){
        return mergeHelper(list1, list2);
    }

    private  ListNode mergeHelper(ListNode list1, ListNode list2) {
        ListNode prehead = new ListNode(-1, null);
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