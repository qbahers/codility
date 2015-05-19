import java.util.*;

class Solution {
    
    public int[] solution(int N, int[] A) {
        int[] res = new int[N];
        
        int max = 0;
        int max_counter = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] <= N) {
                res[A[i] - 1] += Math.max(0, max_counter - res[A[i] - 1]) + 1;
                
                max = Math.max(max, res[A[i] - 1]);
            }
            else {
                max_counter = max;
            }
        }
        
        for (int i = 0; i < N; i++) {
            if (res[i] < max_counter) res[i] = max_counter;
        }
        
        return res;
    }
    
}