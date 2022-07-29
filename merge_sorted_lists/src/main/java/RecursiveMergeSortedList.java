import lombok.AllArgsConstructor;
import lombok.experimental.*;
import lombok.AccessLevel;

@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class RecursiveMergeSortedList {
    ListNode list1;
    ListNode list2;

    public ListNode merge(){
        return mergeHelper(list1, list2);
    }

    private ListNode mergeHelper(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }
        if (list1.value < list2.value) {
            list1.next = mergeHelper(list1.next, list2);
            return list1;
        } else {
            list2.next = mergeHelper(list1, list2.next);
            return list2;
        }
    }

}
