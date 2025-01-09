package Pentabonacci;

import java.util.Arrays;

public class Pentanacci {
    public static long countOddPentaFib(long n) {
        long result = 0;
        int[] resultsArray = new int[(int) n + 1];
        resultsArray[0] = 0;
        resultsArray[1] = 1;
        resultsArray[2] = 1;
        resultsArray[3] = 0;
        resultsArray[4] = 0;
        for(int i = 5; i <= n; i++){
            int temp = 0;
            for(int j = i; j >= i - 5; j-- ){
                temp += resultsArray[j];
            }
            resultsArray[i] = (temp % 2 == 0) ? 0 : 1;
        }

        result = Arrays.stream(resultsArray).sum();

        return result-1;
    }

    public static void main(String[] args) {

        System.out.println(Pentanacci.countOddPentaFib(45));
        System.out.println(Pentanacci.countOddPentaFib(68));
        System.out.println(Pentanacci.countOddPentaFib(76));
        System.out.println(Pentanacci.countOddPentaFib(100));
        System.out.println(Pentanacci.countOddPentaFib(121));
    }
}
