package _2_OddOccurencesInArray;

import java.util.Arrays;

public class Solution {


    public static int solution(int[] A) {
        int unpaired = 0;

        for(int i = 0; i< A.length; i++){

            unpaired ^= A[i];
            //System.out.println("Iteration: " + i + ", Unpaired: " + unpaired + ", A[i]: " + A[i]);
        }

        return unpaired;
    }

    public static int solution2(int[] A){
        int unpaired = 0;

        Arrays.sort(A);

        for (int i = 0; i < A.length-1; i+=2) {

            if( A[i] != A[i+1]){
                unpaired = A[i];
            }
        }
        if(unpaired == 0){
            unpaired = A[A.length-1];
        }

        return unpaired;
    }


}
