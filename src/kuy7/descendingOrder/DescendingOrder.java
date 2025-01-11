package kuy7.descendingOrder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.stream.IntStream;

public class DescendingOrder {
    public static int sortDesc(final int num) {
        String[] charArray = String.valueOf(num).split("");
        Arrays.sort(charArray, Collections.reverseOrder());
        return Integer.parseInt(String.join("", charArray));
    }


    public static void main(String[] args) {
        System.out.println(sortDesc(123787));
    }
}