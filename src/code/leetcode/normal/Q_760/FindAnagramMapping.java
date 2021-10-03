package code.leetcode.normal.Q_760;

import code.base.BaseSolution;

import java.util.HashMap;
import java.util.Map;

public class FindAnagramMapping extends BaseSolution {


  /*
  * Given two lists Aand B, and B is an anagram of A. B is an anagram of A means B is made by randomizing the order of the elements in A.

We want to find an index mapping P, from A to B. A mapping P[i] = j means the ith element in A appears in B at index j.

These lists A and B may contain duplicates. If there are multiple answers, output any of them.

For example, given

A = [12, 28, 46, 32, 50]
B = [50, 12, 32, 46, 28]
We should return
[1, 4, 3, 2, 0]*/


    @Override
    public void solveIt() {
        int[] A = {12, 28, 46, 32, 50};
        int[] B = {50, 12, 32, 46, 28};
        anagramMappings(A, B);
    }

    public int[] anagramMappings(int[] A, int[] B) {
        Map<Integer, Integer> indexMap = new HashMap<>();
        for(int i = 0; i < B.length; i++) {
            indexMap.put(B[i], i);
        }

        int[] mapper = new int[A.length];
        for(int i = 0; i < B.length; i++) {
            mapper[i] = indexMap.get(A[i]);
        }

        return mapper;
    }
}
