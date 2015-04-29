import java.util.*;

class Solution {
    
    public int solution(int N) {
        int i = 1;
        
        int res = 0;
        int sqrtMax = (int) Math.sqrt(Integer.MAX_VALUE);
        while (i <= sqrtMax && i * i < N) {
            if (N % i == 0) res += 2;
            
            i++;
        }
        
        if (i * i == N) res++;
        
        return res;
    }
    
}
