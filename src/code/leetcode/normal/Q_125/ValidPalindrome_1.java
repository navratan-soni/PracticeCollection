package code.leetcode.normal.Q_125;

import code.base.BaseSolution;

public class ValidPalindrome_1 extends BaseSolution {


     /*
       @Link https://leetcode.com/problems/valid-palindrome/
       Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

       Note: For the purpose of this problem, we define empty string as valid palindrome.

       Input: "A man, a plan, a canal: Panama"
       Output: true

     */

    @Override
    public void solveIt() {
        String str = ".,";
        System.out.println(isPalindrome(str));
    }

    public boolean isPalindrome(String str) {
        if(str == null || str.length() == 0 || str.length() == 1)
            return true;

        int i = 0;
        int j = str.length() - 1;

        while (true) {
           while (isNotDigitOrAlphabet(str.charAt(i)) && (i<j)) {
               i++;
           }
           while (isNotDigitOrAlphabet(str.charAt(j)) && (i<j)) {
               j--;
           }
           if(i < j) {
              if(Character.toLowerCase(str.charAt(i)) != Character.toLowerCase(str.charAt(j))) {
                  return false;
              }
              i++;
              j--;
           } else {
               break;
           }
        }

        return true;
    }

    private boolean isNotDigitOrAlphabet(char c) {
        return ((c < '0' || c > '9') && (c < 'A' || c > 'Z') && (c < 'a' || c > 'z'));
    }
}
