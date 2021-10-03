package code.leetcode.tests.Q_977;

import code.leetcode.normal.Q_977.SquaresOfaSortedArray;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SquaresOfaSortedArrayTest {
    @Test
    public void squaresOfaSortedArray() {
        int[] A = {-4,-1,0,3,10};
        SquaresOfaSortedArray solution = new SquaresOfaSortedArray();
        assertArrayEquals(solution.sortedSquares(A), new int[]{0,1,9,16,100});
    }
}
