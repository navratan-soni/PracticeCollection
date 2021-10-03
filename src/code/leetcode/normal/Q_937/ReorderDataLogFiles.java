package code.leetcode.normal.Q_937;

import code.base.BaseSolution;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class ReorderDataLogFiles extends BaseSolution {

    /*
       @Link https://leetcode.com/problems/reorder-data-in-log-files/
       You have an array of logs.  Each log is a space delimited string of words.

For each log, the first word in each log is an alphanumeric identifier.  Then, either:

Each word after the identifier will consist only of lowercase letters, or;
Each word after the identifier will consist only of digits.
We will call these two varieties of logs letter-logs and digit-logs.  It is guaranteed that each log has at least one word after its identifier.

Reorder the logs so that all of the letter-logs come before any digit-log.  The letter-logs are ordered lexicographically ignoring identifier, with the identifier used in case of ties.  The digit-logs should be put in their original order.

Return the final order of the logs.

Input: logs = ["dig1 8 1 5 1","let1 art can","dig2 3 6","let2 own kit dig","let3 art zero"]
Output: ["let1 art can","let3 art zero","let2 own kit dig","dig1 8 1 5 1","dig2 3 6"]

0 <= logs.length <= 100
3 <= logs[i].length <= 100
logs[i] is guaranteed to have an identifier, and a word after the identifier.
     */
    Map<String, String> sortMap = new HashMap<>();

    @Override
    public void solveIt() {
        System.out.println(Arrays.asList(reorderLogFiles(new String[]{"a1 9 2 3 1","g1 act car","zo4 4 7","ab1 off key dog","a8 act zoo","a2 act car"})));
    }

    public String[] reorderLogFiles(String[] logs) {
        Arrays.sort(logs, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return sort(o1, o2);
            }
        });

        return logs;
    }

    private int sort(String o1, String o2) {
        String val1 = sortMap.get(o1);
        String val2 = sortMap.get(o2);

        if(val1 == null) {
            String[] arr1 = o1.split(" ", 2);
            sortMap.put(o1, arr1[1]);
            val1 = arr1[1];
        }

        if(val2 == null) {
            String[] arr2 = o2.split(" ", 2);
            sortMap.put(o2, arr2[1]);
            val2 = arr2[1];
        }

        char c1 = val1.charAt(0);
        char c2 = val2.charAt(0);

        if(Character.isAlphabetic(c1) && Character.isAlphabetic(c2)) {
            if(val1.equals(val2)) {
                return o1.split(" ", 2)[0].compareTo(o2.split(" ", 2)[0]);
            }
            return val1.compareTo(val2);
        }

        if(Character.isDigit(c1)&& Character.isDigit(c2)) {
            return 0;
        }

        if(Character.isDigit(c1)) {
            return 1;
        } else return -1;
    }
}
