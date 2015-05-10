import java.util.*;

class Solution {
    
    public int solution(int N) {
        int k = 0;
        int res = 0;
        int start = -1;
        
        while (N > 0) {
            if (N % 2 == 1) {
                if (start == -1) {
                    start = k;
                }
                else {
                    res = Math.max(res, k - start - 1);
                    start = k;
                }
            }
            
            N /= 2;
            k++;
        }
        
        return res;
    }
    
}
