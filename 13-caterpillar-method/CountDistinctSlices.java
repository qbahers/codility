import java.util.*;

class Solution {

    public int solution(int M, int[] A) {
        int N = A.length;

        int front = 0;
        int back = 0;

        int[] pos = new int[M + 1];
        Arrays.fill(pos, -1);
        
        long res = 0;
        while (front < N) {
            while (front < N && pos[A[front]] == -1) {
                pos[A[front]] = front;
                front++;
            }
            
            long d = front - back;            
            res += d * (d + 1) / 2;
            
            if (front >= N) break;
            
            long dd = front - pos[A[front]] - 1;
            res -= dd * (dd + 1) / 2;
            
            int formerBack = back;
            back = pos[A[front]] + 1;
               
            for(int i = formerBack; i < back; i++) {
                pos[A[i]] = -1;    
            }
        }
        
        return (res < 1e9) ? (int) res : (int) 1e9;
    }
    
}