package code.leetcode.tests.Q_1165;

import code.leetcode.premium.Q_1165.SingleRowKeyboard;
import org.junit.Test;

import static org.junit.Assert.*;

public class SingleRowKeyboardTest {

    @Test
    public void calculateTime() {
        SingleRowKeyboard solution = new SingleRowKeyboard();
        assertEquals(solution.calculateTime("pqrstuvwxyzabcdefghijklmno", "leetcode"), 73);
    }
}