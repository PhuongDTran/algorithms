import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static  org.junit.jupiter.api.Assertions.*;

public class BinarySearchTest {

    static BinarySearch binarySearch;

    @BeforeAll
    public static void setUp() {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        binarySearch = new BinarySearch(array);
    }

    @Test
    public void testNotFound() {
        assertEquals(-1 , binarySearch.search(0));
    }

    @Test
    public void testFoundInBetween() {
        assertEquals(5, binarySearch.search(6));
    }

    @Test
    public void testFoundAtStart() {
        assertEquals(0, binarySearch.search(1));
    }

    @Test
    public void testFoundAtEnd() {
        assertEquals(9, binarySearch.search(10));
    }

}
