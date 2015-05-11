import java.util.*;

class Solution {
    
    public int solution(Tree T) {
        if (T == null) {
            return -1;
        }
        else {
            return 1 + Math.max(solution(T.l), solution(T.r));
        }
    }
    
}