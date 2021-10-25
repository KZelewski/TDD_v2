package _1_Iterations;

public class Solution {

    public static int solution(int N) {
        String Nstring = Integer.toBinaryString(N);
        int resultIndirect = 0;
        int result = 0;

        for(int i=0; i<Nstring.length();i++){


            if (Nstring.charAt(i) == '0'){
                resultIndirect ++;
            }
            if (Nstring.charAt(i) == '1'){
                if (resultIndirect > result) {
                    result = resultIndirect;
                }
                resultIndirect = 0;
            }
        }
        return result;
    }

}
