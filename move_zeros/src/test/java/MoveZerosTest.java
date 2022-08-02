import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MoveZerosTest {
    MoveZeros moveZeros;

    @Test
    public void testAllNonZeros(){
        int[] nums = new int[]{1,2,3,4,5};
        moveZeros = new MoveZeros();
        moveZeros.moveZeros(nums);
        assertArrayEquals(nums, nums);
    }

    @Test
    public void testMoveFrontZeros(){
        int[] nums = new int[]{0,0,0,0,1,2,3,4,5};
        int[] expected = new int[]{1,2,3,4,5,0,0,0,0};
        moveZeros = new MoveZeros();
        moveZeros.moveZeros(nums);
        assertArrayEquals(expected, nums);
    }

    @Test
    public void testMoveMiddleZeros(){
        int[] nums = new int[]{1,2,0,0,3,4,5};
        int[] expected = new int[]{1,2,3,4,5,0,0};
        moveZeros = new MoveZeros();
        moveZeros.moveZeros(nums);
        assertArrayEquals(expected, nums);
    }

    @Test
    public void testMoveZeroAtRandom(){
        int[] nums = new int[]{0,1,0,2,0,0,3,0,4,5,0};
        int[] expected = new int[]{1,2,3,4,5,0,0,0,0,0,0};
        moveZeros = new MoveZeros();
        moveZeros.moveZeros(nums);
        assertArrayEquals(expected, nums);
    }
}
