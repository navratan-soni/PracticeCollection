package code.leetcode.tests.Q_929;

import code.leetcode.normal.Q_929.UniqueEmailAddress;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class UniqueEmailAddressTest {
    @Test
    public void uniqueEmailAddress() {
        String[] A = {"test.email+alex@code.leetcode.com","test.e.mail+bob.cathy@code.leetcode.com","testemail+david@lee.tcode.com"};
        UniqueEmailAddress solution = new UniqueEmailAddress();
        assertEquals(solution.numUniqueEmails(A), 2);
    }
}
