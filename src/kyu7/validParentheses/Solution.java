package kyu7.validParentheses;

public class Solution {
    public static boolean validParentheses(String parenStr) {
        char[] array = parenStr.toCharArray();
        int sum = 0;
        for (char c : array) {
            if (c == '(') sum ++;
            else sum --;
            if (sum < 0) return false;
        }

        return sum == 0;
    }
}
