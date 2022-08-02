public class MoveZeros {
    public void moveZeros(int[] nums) {
        int nonZeroAt = -1;
        for( int i = 0 ; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[++nonZeroAt] = nums[i];
            }
        }
        for (int i = nonZeroAt + 1; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}
