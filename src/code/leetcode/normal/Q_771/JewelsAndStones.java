package code.leetcode.normal.Q_771;

import code.base.BaseSolution;

import java.util.HashSet;
import java.util.Set;

public class JewelsAndStones extends BaseSolution {
    /*
    * You're given strings J representing the types of stones that are jewels, and S representing the stones you have.
    * Each character in S is a type of stone you have.  You want to know how many of the stones you have are also jewels.

     The letters in J are guaranteed distinct, and all characters in J and S are letters. Letters are case sensitive,
     so "a" is considered a different type of stone from "A".

      Input: J = "aA", S = "aAAbbbb"
      Output: 3

      Input: J = "z", S = "ZZ"
      Output: 0

    */
    @Override
    public void solveIt() {
        System.out.println(numJewelsInStones("aA", "aAAJJJ"));
    }

    public int numJewelsInStones(String J, String S) {
       int count = 0;
       Set<Character> jewels = new HashSet<>();
       for(char c : J.toCharArray()) {
           jewels.add(c);
       }

       for(char c : S.toCharArray()) {
           if(jewels.contains(c))
               count++;
       }

       return count;
    }
}
