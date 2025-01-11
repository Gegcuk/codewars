package kyu8.sumArray;

import java.util.Arrays;

public class SumArray {

    public static double sum(double[] numbers) {
        return numbers.length == 0 ? 0 : Arrays.stream(numbers).sum();
    }
}
