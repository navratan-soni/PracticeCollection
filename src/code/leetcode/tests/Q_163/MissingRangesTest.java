package code.leetcode.tests.Q_163;

import code.leetcode.normal.Q_163.MissingRanges;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class MissingRangesTest {
    @Test
    public void missingRange() {
        int[] input = {0,1,3,50,75};
        int lower = 0;
        int upper = 99;

        List<String> list = new ArrayList<>();
        list.add("2");
        list.add("4->49");
        list.add("51->74");
        list.add("76->99");

        MissingRanges solution = new MissingRanges();
        Assert.assertEquals(solution.findMissingRanges(input, lower, upper), list);
    }
}
