import java.util.*;

class Solution {

    public int solution(int[] A, int[] B) {
        int N = A.length;

        int end = -1;

        int res = 0;
        for (int i = 0; i < N; i++) {
            if (A[i] > end) {
                end = B[i];
                res++;
            }
        }
        
        return res;
    }
    
}
