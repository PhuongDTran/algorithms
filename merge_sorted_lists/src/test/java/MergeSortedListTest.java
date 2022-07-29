import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MergeSortedListTest {

    static ListNode emptyList;
    static ListNode oneElementLst;
    static ListNode lst1;
    static ListNode lst2;
    static RecursiveMergeSortedList recursiveMerge;
    static IterativeMergeSortedList iterativeMerge;

    @BeforeEach
    public void setup() {
        emptyList = null;
        oneElementLst = ListNode.parseArrayToListNode(new int[]{4});
        lst1 = ListNode.parseArrayToListNode(new int[]{1, 3, 5,});
        lst2 = ListNode.parseArrayToListNode(new int[]{1, 4, 6, 9});
    }

    @Test
    public void testRecursiveMergeEmptyListsFor() {
        recursiveMerge = new RecursiveMergeSortedList(emptyList, emptyList);
        assertNull(recursiveMerge.merge());
    }

    @Test
    public void testRecursiveMergeEmptyAndOneElementList() {
        recursiveMerge = new RecursiveMergeSortedList(emptyList, oneElementLst);
        assertSame(recursiveMerge.merge(), oneElementLst);
    }

    @Test
    public void testRecursiveMergeTwoLists() {
        recursiveMerge = new RecursiveMergeSortedList(lst1, lst2);
        ListNode expectedResult = ListNode.parseArrayToListNode(new int[]{1, 1, 3, 4, 5, 6, 9});
        assertEquals(recursiveMerge.merge(), expectedResult);
    }

    @Test
    public void testIterativeMergeEmptyLists() {
        iterativeMerge = new IterativeMergeSortedList(emptyList, emptyList);
        assertNull(iterativeMerge.merge());
    }

    @Test
    public void testIterativeMergeEmptyAndOneElementList() {
        iterativeMerge = new IterativeMergeSortedList(emptyList, oneElementLst);
        assertSame(iterativeMerge.merge(), oneElementLst);
    }

    @Test
    public void testIterativeMergeTwoLists() {
        iterativeMerge = new IterativeMergeSortedList(lst1, lst2);
        ListNode expectedResult = ListNode.parseArrayToListNode(new int[]{1, 1, 3, 4, 5, 6, 9});
        assertEquals(iterativeMerge.merge(), expectedResult);
    }


}
