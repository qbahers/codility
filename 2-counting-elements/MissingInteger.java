import java.util.*;

class Solution {
    
    public int solution(int[] A) {
        SortedSet<Integer> set = new TreeSet<Integer>();
        
        for (int x : A) {
            if (x > 0) set.add(x);
        }
        
        int i = 0;
        for (int x : set) {
            if (x != i + 1) return i + 1;
            i++;
        }
        
        return set.size() + 1;
    }
    
}