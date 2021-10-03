package code.leetcode.normal.Q_1099;

import code.base.BaseSolution;

import java.util.Arrays;


public class TwoSumLessThanK extends BaseSolution {

    /*
       @Link https://leetcode.com/problems/two-sum-less-than-k/
       Given an array A of integers and integer K, return the maximum S such that there exists i < j with A[i] + A[j] = S and S < K.
       If no i, j exist satisfying this equation, return -1.

       Input: A = [34,23,1,24,75,33,54,8], K = 60
       Output: 58
       Explanation:
       We can use 34 and 24 to sum 58 which is less than 60.
     */

    @Override
    public void solveIt() {
        System.out.println(twoSumLessThanK(new int[]{34,23,1,24,75,33,54,8}, 60));
    }

    public int twoSumLessThanK(int[] A, int K){
        int maxSum = -1;
        Arrays.sort(A);
        int low = 0;
        int high = A.length - 1;

        while (low < high) {
            int sum = A[low] + A[high];
            if(sum < K && sum > maxSum) {
                maxSum = sum;
            }
            if(sum > K) {
                high --;
            } else {
                low ++;
            }
        }

        return maxSum;
    }
}
