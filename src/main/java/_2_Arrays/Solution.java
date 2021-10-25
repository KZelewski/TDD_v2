package _2_Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Solution {

    public static int[] solution (int[] A, int K){

        int[] firstArray = new int[A.length-1];

        int[] secondArray = {A[A.length-1]};

        IntStream.range(0, A.length)
                .filter(i -> i != A.length-1)
                .map(i -> firstArray[i])
                .toArray();

        return A;

    }

}
