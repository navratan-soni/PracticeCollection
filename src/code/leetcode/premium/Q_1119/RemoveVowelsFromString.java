package code.leetcode.premium.Q_1119;

import code.base.BaseSolution;

public class RemoveVowelsFromString extends BaseSolution {


    /*
      @Link https://leetcode.com/problems/remove-vowels-from-a-string/
      Given a string S, remove the vowels 'a', 'e', 'i', 'o', and 'u' from it, and return the new string.

      Input: "leetcodeisacommunityforcoders"
      Output: "ltcdscmmntyfrcdrs"
    */
    @Override
    public void solveIt() {
        System.out.println(removeVowels("abcd"));
    }

    public String removeVowels(String string) {
     StringBuilder builder = new StringBuilder();
     for(char ch : string.toCharArray()) {
         if(!isVowel(ch)) {
             builder.append(ch);
         }
     }
     return builder.toString();
    }

    public boolean isVowel (char ch) {
        return ((ch == 'a')|| (ch == 'e')|| (ch == 'i')|| (ch == 'o')|| (ch == 'u'));
    }
}
