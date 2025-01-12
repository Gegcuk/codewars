package kyu8.stringyStrings;

public class Solution {
    public static String stringy(int size) {
        StringBuilder resultString = new StringBuilder();
        for(int i = 1; i <= size; i++){
            if(i % 2 != 0) resultString.append("1");
            else resultString.append("0");
        }
        return resultString.toString();
    }

    public static void main(String[] args) {
        System.out.println(stringy(1));
    }
}
