import java.util.*;

class Solution {
    
    public int solution(int[] A) {
        int N = A.length;
        
        Arrays.sort(A);
        
        int i = 0;
        while (i + 1 < N) {
            if (A[i] != A[i + 1]) return A[i];
            
            i += 2;
        }
        
        return A[N - 1];
    }
    
}
