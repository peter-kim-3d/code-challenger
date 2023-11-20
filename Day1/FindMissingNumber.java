package Day1;

import java.util.Arrays;

/**
 * FindMissingNumber
 */
public class FindMissingNumber {
    public static void main(String[] args) {
        int[] arry = {3, 0, 1};
        System.out.println(findMissingNumber(arry));
    }

    static int findMissingNumber(int[] arry) {
        //calcuate sum by formula 
        int n = arry.length;
        int sum = n * (n + 1) / 2;
        int total = Arrays.stream(arry).sum();
        //sum
        return sum - total;
    }
}