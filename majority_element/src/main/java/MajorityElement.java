import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MajorityElement {
    private int[] nums;


    public MajorityElement(int[] nums) {
        this.nums = nums;
    }

    public int findMajorityElement() {
        int majority = 0;
        int majorityCount = 0;
        for(int num : nums) {
            if (majorityCount == 0) {
                majority = num;
            }
            majorityCount += (majority == num) ? 1 : -1;
        }
        return majority;
    }
}
