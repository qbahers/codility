import java.util.*;

class Solution {
    
    public int solution(int K, int[] A) {
        int N = A.length;
        
        int sum = 0;
        int count = 0;
        
        for (int i = 0; i < N; i++) {
            if (sum < K) {
                sum += A[i];
            }
            else {
                count++;
                sum = A[i];
            }
        }
        
        if (sum >= K) count++;
        
        return count;
    }
    
}
