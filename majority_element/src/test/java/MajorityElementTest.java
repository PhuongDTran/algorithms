import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MajorityElementTest {
    int[] nums;
    MajorityElement majorityElement;

    @Test
    public void testOneElement() {
        nums = new int[]{1};
        majorityElement = new MajorityElement(nums);
        int result = majorityElement.findMajorityElement();
        assertEquals(1, result);
    }

    @Test
    public void testMultipleElements() {
        nums = new int[]{5,4,3,4,1,2,3,4,4,4,4};
        majorityElement = new MajorityElement(nums);
        int result = majorityElement.findMajorityElement();
        assertEquals(4, result);
    }
}
