import java.util.*;

class Solution {
    
    public int solution(String S) {
        int N = S.length();
        
        if (N % 2 == 0) return -1;
        
        int k = 0;
        while (k < N && S.charAt(k) == S.charAt(N - 1 - k)) {
            k++;    
        }
        
        return (k == N) ? N / 2 : -1;
    }
    
}
