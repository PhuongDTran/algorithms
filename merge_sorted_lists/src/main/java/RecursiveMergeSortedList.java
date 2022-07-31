public class RecursiveMergeSortedList {
    private ListNode list1;
    private ListNode list2;

    public RecursiveMergeSortedList(int[] l1, int[] l2) {
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
