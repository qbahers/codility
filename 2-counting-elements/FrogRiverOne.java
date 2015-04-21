import java.util.*;

class Solution {

    public int solution(int X, int[] A) {
        int N = A.length;
        
        Set<Integer> set = new HashSet<Integer>();
        
        for (int i = 0; i < N; i++) {
            set.add(A[i]);
            
            if (set.size() == X) return i;
        }
        
        return -1;
    }

}