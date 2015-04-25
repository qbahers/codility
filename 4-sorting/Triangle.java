import java.util.*;

class Solution {

    public int solution(int[] A) {
        int N = A.length;
        
        Arrays.sort(A);
        
        for (int i = 0; i < N - 2; i++) {
            long p = A[i];
            long q = A[i + 1];
            long r = A[i + 2];
            
            if (p + q > r && q + r > p && r + p > q) return 1;
        }
        
        return 0;
    }

}
