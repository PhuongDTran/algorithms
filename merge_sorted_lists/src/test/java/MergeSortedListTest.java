import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MergeSortedListTest {

    static int[] emptyList;
    static int[] oneElementLst;
    static int[] lst1;
    static int[] lst2;
    static RecursiveMergeSortedList recursiveMerge;
    static IterativeMergeSortedList iterativeMerge;

    @BeforeEach
    public void setup() {
        emptyList = new int[]{};
        oneElementLst = new int[]{4};
        lst1 = new int[]{1, 3, 5,};
        lst2 = new int[]{1, 4, 6, 9};
    }

    @Test
    public void testRecursiveMergeEmptyLists() {
        recursiveMerge = new RecursiveMergeSortedList(emptyList, emptyList);
        int[]  result = ListNode.convertListNodeToArray(recursiveMerge .merge());
        assertArrayEquals(result, emptyList);
    }

    @Test
    public void testRecursiveMergeEmptyAndOneElementList() {
        recursiveMerge = new RecursiveMergeSortedList(emptyList, oneElementLst);
        int[]  result = ListNode.convertListNodeToArray(recursiveMerge .merge());
        assertArrayEquals(result, oneElementLst);
    }

    @Test
    public void testRecursiveMergeTwoLists() {
        recursiveMerge = new RecursiveMergeSortedList(lst1, lst2);
        int[] expected = new int[]{1, 1, 3, 4, 5, 6, 9};
        int[]  result = ListNode.convertListNodeToArray(recursiveMerge .merge());
        assertArrayEquals(result, expected);
    }

    @Test
    public void testIterativeMergeEmptyLists() {
        iterativeMerge = new IterativeMergeSortedList(emptyList, emptyList);
        assertNull(iterativeMerge.merge());
    }

    @Test
    public void testIterativeMergeEmptyAndOneElementList() {
        iterativeMerge = new IterativeMergeSortedList(emptyList, oneElementLst);
        int[]  result = ListNode.convertListNodeToArray(iterativeMerge.merge());
        assertArrayEquals(result, oneElementLst);
    }

    @Test
    public void testIterativeMergeTwoLists() {
        iterativeMerge = new IterativeMergeSortedList(lst1, lst2);
        int[] expected =new int[]{1, 1, 3, 4, 5, 6, 9};
        int[]  result = ListNode.convertListNodeToArray(iterativeMerge.merge());
        assertArrayEquals(result, expected);
    }
}
