package code.leetcode.tests.Q_359;

import code.leetcode.normal.Q_359.LoggerRateLimiter;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class LoggerRateLimiterTest {
    @Test
    public void shouldPrintMessage() {
        LoggerRateLimiter solution = new LoggerRateLimiter();
        assertTrue(solution.shouldPrintMessage(0, "hello"));
        assertFalse(solution.shouldPrintMessage(1, "hello"));
        assertTrue(solution.shouldPrintMessage(1, "buffello"));
        assertFalse(solution.shouldPrintMessage(10, "buffello"));
        assertTrue(solution.shouldPrintMessage(11, "buffello"));
    }
}
