package code.leetcode.normal.Q_977;

import code.base.BaseSolution;

public class SquaresOfaSortedArray extends BaseSolution {
    /*
    https://leetcode.com/problems/squares-of-a-sorted-array/

    Given an array of integers A sorted in non-decreasing order,
    return an array of the squares of each number, also in sorted non-decreasing order.

     Example 1:
     Input: [-4,-1,0,3,10]
     Output: [0,1,9,16,100]

    Example 2:
    Input: [-7,-3,2,3,11]
    Output: [4,9,9,49,121]
     */

    @Override
    public void solveIt() {

    }

    public int[] sortedSquares(int[] A) {
       int pivot = 0;
       while (pivot < A.length && A[pivot] < 0) {
           pivot++;
       }

       int negativeStart = pivot-1;
       int positiveStart = pivot;

       int[] ansArray = new int[A.length];
       int ansIndex = 0;

       while (negativeStart >= 0 && positiveStart < A.length) {
           if(A[negativeStart] * A[negativeStart] < A[positiveStart]*A[positiveStart]) {
               ansArray[ansIndex] = A[negativeStart] * A[negativeStart];
               negativeStart--;
           } else {
               ansArray[ansIndex] = A[positiveStart] * A[positiveStart];
               positiveStart++;
           }
           ansIndex++;
       }

        while (negativeStart >= 0) {
            ansArray[ansIndex] = A[negativeStart] * A[negativeStart];
            ansIndex++;
            negativeStart--;
        }

        while (positiveStart < A.length) {
            ansArray[ansIndex] = A[positiveStart] * A[positiveStart];
            positiveStart++;
            ansIndex++;
        }

        return ansArray;
    }

}
