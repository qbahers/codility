import java.util.*;

class Solution {

    public int solution(int N) {
        int i = 1;
        
        int min = Integer.MAX_VALUE;
        while (i * i <= N) {
            if (N % i == 0) {
                min = Math.min(min, 2 * (i + N / i));
            }
            
            i++;
        }
        
        return min;
    }

}
