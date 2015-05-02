import java.util.*;

class Solution {

    public int solution(int[] A) {
        int N = A.length;
        
        int size = 0;
        int value = -1;
        
        for (int i = 0; i < N; i++) {
            if (size == 0) {
                size++;
                value = A[i];
            }
            else {
                if (A[i] != value) {
                    size--;    
                }
                else {
                    size++;    
                }
            }
        }
        
        if (size == 0) return 0;    

        int res = 0;

        int countR = 0;
        for (int i = 0; i < N; i++) {
            if (A[i] == value) countR++;
        }
        
        int countL = 0;
        for (int i = 0; i < N; i++) {
            if (A[i] == value) {
                countL++;
                countR--;
            }
            
            if (countL > (i + 1) / 2 && countR > (N - i - 1) / 2) {
                res++;    
            }
        }
        
        return res;
    }
    
}
