package _2_Arrays;

import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {

        int[] A = {1,2,3,4,5};
        int K = 2;
        int[] result = new int[A.length];

        //int[] result = Solution.solution(A,K);
        //int [] rotatedA = new int[A.length];

        for(int i=0; i<A.length; i++) {
            int rotatedIndex = (i + K) % A.length;
            result[rotatedIndex] = A[i];
            System.out.println("Iteration: " + i + ", RotatedIndex: " + rotatedIndex + ", Result:  " + result[rotatedIndex]);
        }

    }

}
