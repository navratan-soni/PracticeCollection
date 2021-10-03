package code.leetcode.tests.Q_482;

import code.leetcode.normal.Q_482.LicenseKeyFormatting;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LicenseKeyFormattingTest {
    @Test
    public void licenseKeyFormatting() {
        LicenseKeyFormatting solution = new LicenseKeyFormatting();
        assertEquals(solution.licenseKeyFormatting("5F3Z-2e-9-w", 4), "5F3Z-2E9W");
        assertEquals(solution.licenseKeyFormatting("2-5g-3-J", 2), "2-5g-3J");
    }
}
