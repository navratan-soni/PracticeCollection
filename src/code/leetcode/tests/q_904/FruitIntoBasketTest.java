package code.leetcode.tests.q_904;

import code.leetcode.normal.Q_904.FruitIntoBasket;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FruitIntoBasketTest {

    @Test
    public void mostCommonWord() {
        FruitIntoBasket solution = new FruitIntoBasket();
        int[] arr1 = {1,2,1};
        assertEquals(solution.totalFruit(arr1), 3);

        int[] arr2 = {0,1,2,2};
        assertEquals(solution.totalFruit(arr2), 3);

        int[] arr3 = {1,2,3,2,2};
        assertEquals(solution.totalFruit(arr3), 4);

        int[] arr4 = {3,3,3,1,2,1,1,2,3,3,4};
        assertEquals(solution.totalFruit(arr4), 5);

        int[] arr5 = {0,1,6,6,4,4,6};
        assertEquals(solution.totalFruit(arr5), 5);
    }
}
