package code.leetcode.premium.Q_1165;

import code.base.BaseSolution;

import java.util.HashMap;
import java.util.Map;

public class SingleRowKeyboard extends BaseSolution {

    /*
       @Link https://leetcode.com/problems/single-row-keyboard/
       There is a special keyboard with all keys in a single row.

Given a string keyboard of length 26 indicating the layout of the keyboard (indexed from 0 to 25), initially your finger is at index 0. To type a character, you have to move your finger to the index of the desired character. The time taken to move your finger from index i to index j is |i - j|.

You want to type a string word. Write a function to calculate how much time it takes to type it with one finger.
Input: keyboard = "pqrstuvwxyzabcdefghijklmno", word = "code.leetcode"
Output: 73
     */

    @Override
    public void solveIt() {
        System.out.println(calculateTime("pqrstuvwxyzabcdefghijklmno", "leetcode"));
    }

    public int calculateTime(String keyBoard, String word) {
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < keyBoard.length(); i++) {
            map.put(keyBoard.charAt(i), i);
        }
        int distance = 0;
        int previousPos = 0;
        for(char ch : word.toCharArray()) {
            int pos = map.get(ch);
            distance += Math.abs(pos - previousPos);
            previousPos = pos;
        }
        return distance;
    }
}
