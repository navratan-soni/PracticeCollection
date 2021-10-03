package code.leetcode.tests.Q_125;

import code.leetcode.normal.Q_125.ValidPalindrome_1;
import org.junit.Test;

import static org.junit.Assert.*;

public class ValidPalindrome_1Test {

    @Test
    public void isPalindrome() {
        ValidPalindrome_1 solution = new ValidPalindrome_1();
        assertTrue(solution.isPalindrome(""));
        assertTrue(solution.isPalindrome("A man, a plan, a canal: Panama"));
        assertFalse(solution.isPalindrome("race a car"));
        assertTrue(solution.isPalindrome("racecar"));
        assertTrue(solution.isPalindrome(".,"));
    }
}