import java.util.*;

class Solution {

    public int solution(int[] A) {
        int N = A.length;
        
        Arrays.sort(A);
        
        return Math.max(A[0] * A[1] * A[N - 1], A[N - 1] * A[N - 2] * A[N - 3]);
    }

}