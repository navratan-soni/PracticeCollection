package code.leetcode.tests.Q_1099;

import code.leetcode.normal.Q_1099.TwoSumLessThanK;
import org.junit.Test;
import static org.junit.Assert.*;

public class TwoSumLessThanKTest {

    @Test
    public void twoSumLessThanK() {
        TwoSumLessThanK solution = new TwoSumLessThanK();
        assertEquals(solution.twoSumLessThanK(new int[]{34,23,1,24,75,33,54,8}, 60), 58);
    }
}