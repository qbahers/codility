import java.util.*;

class Solution {
    
    public int[] solution(int N, int[] P, int[] Q) {
        int[] f = arrayF(N);
        
        int[] nbSemiprimes = new int[N + 1];
        int count = 0;
        for (int i = 0; i <= N; i++) {
            if (isSemiprime(i, f)) {
                count++;
            }
            nbSemiprimes[i] = count;
        }
        
        int[] res = new int[P.length];
        for (int i = 0; i < P.length; i++) {
            res[i] = nbSemiprimes[Q[i]] - nbSemiprimes[P[i] - 1];    
        }
        
        return res;
    }
    
    private int[] arrayF(int N) {
        int[] f = new int[N + 1];
        int i = 2;
        while (i * i <= N) {
            if (f[i] == 0) {
                int k = i * i;
                while (k <= N) {
                    if (f[k] == 0) {
                        f[k] = i;    
                    }
                    k += i;
                }
            }
            i += 1;
        }
        return f;
    }
    
    private boolean isSemiprime(int x, int[] f) {
        List<Integer> primeFactors = new ArrayList<Integer>();
        while (f[x] > 0) {
            primeFactors.add(f[x]);
            x /= f[x];
        }
        primeFactors.add(x);
        return primeFactors.size() == 2;
    }
}
