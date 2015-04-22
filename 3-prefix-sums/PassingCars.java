import java.util.*;

class Solution {
    
    public int solution(int[] A) {
        int N = A.length;
        
        int nbZeros = 0;
        
        int res = 0;
        for (int i = 0; i < N; i++) {
            if (A[i] == 0) nbZeros++;
            else           res += nbZeros;
            
            if (res > 1e9) return -1;
        }
        
        return res;
    }

}