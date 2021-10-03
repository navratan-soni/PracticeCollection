package code.leetcode.tests.Q_760;

import code.leetcode.normal.Q_760.FindAnagramMapping;
import org.junit.Test;

import static org.junit.Assert.*;

public class FindAnagramMappingTest {

    @Test
    public void anagramMappings() {
        int[] A = {12, 28, 46, 32, 50};
        int[] B = {50, 12, 32, 46, 28};

        FindAnagramMapping solution = new FindAnagramMapping();

        assertArrayEquals(solution.anagramMappings(A, B), new int[]{1, 4, 3, 2, 0});

    }
}