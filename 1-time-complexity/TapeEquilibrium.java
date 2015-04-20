import java.util.*;

class Solution {

    public int solution(int[] A) {
        int N = A.length;
        
        int leftPart = 0;
        int rightPart = 0;
        for (int x : A) rightPart += x;
        
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < N - 1; i++) {
            leftPart += A[i];
            rightPart -= A[i];
            
            min = Math.min(min, Math.abs(leftPart - rightPart));
        }
        
        return min;
    }

}