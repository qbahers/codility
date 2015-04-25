import java.util.*;

class Solution {

    public int solution(int[] A) {
        Set<Integer> set = new HashSet<Integer>();
        
        for (int x : A) set.add(x);
        
        return set.size();
    }
    
}
