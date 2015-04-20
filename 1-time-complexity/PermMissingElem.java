import java.util.*;

class Solution {

    public int solution(int[] A) {
        int N = A.length;
        
        Arrays.sort(A);
        
        for (int i = 0; i < N; i++) {
            if (A[i] != i + 1) return i + 1;    
        }
        
        return (N == 0) ? 1 : N + 1;
    }
    
}