package code.leetcode.tests.Q_1108;

import code.leetcode.normal.Q_1108.DefangingIpAddress;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DefangingIpAddressTest {

    @Test
    public void defangIPaddr() {
        DefangingIpAddress solution =
                new DefangingIpAddress();

        assertEquals(solution.defangIPaddr("1.1.1.1"), "1[.]1[.]1[.]1");
    }
}