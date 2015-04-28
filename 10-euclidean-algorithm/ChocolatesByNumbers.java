import java.util.*;

class Solution {

    public int solution(int N, int M) {
        return N / gcd(N, M);
    }

    private int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

}