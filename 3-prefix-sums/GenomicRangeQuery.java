import java.util.*;

class Solution {

    public int[] solution(String S, int[] P, int[] Q) {
        int N = S.length();
        
        int[] previousA = new int[N];
        int[] previousC = new int[N];
        int[] previousG = new int[N];
        int[] previousT = new int[N];
        
        int pA = -1, pC = -1, pG = -1, pT = -1;
        
        for (int i = 0; i < N; i++) {
            if      (S.charAt(i) == 'A') pA = i;
            else if (S.charAt(i) == 'C') pC = i;
            else if (S.charAt(i) == 'G') pG = i;
            else                         pT = i;
            
            previousA[i] = pA;
            previousC[i] = pC;
            previousG[i] = pG;
            previousT[i] = pT;
        }
        
        int M = P.length;
        int[] res = new int[M];
        
        for (int i = 0; i < M; i++) {
            res[i] = 4;
            
            if (previousG[Q[i]] >= P[i]) res[i] = 3;
            if (previousC[Q[i]] >= P[i]) res[i] = 2;
            if (previousA[Q[i]] >= P[i]) res[i] = 1;
        }
        
        return res;
    }

}