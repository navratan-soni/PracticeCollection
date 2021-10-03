package code.leetcode.tests.Q_844;

import code.leetcode.normal.Q_844.BackspaceStringCompare;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class BackspaceStringCompareTest {
    @Test
    public void backspaceStringCompare() {
        BackspaceStringCompare solution = new BackspaceStringCompare();
        assertTrue(solution.backspaceCompare("a##c", "#a#c#"));
        assertFalse(solution.backspaceCompare("a#c", "b"));
    }
}
