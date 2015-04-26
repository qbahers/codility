import java.util.*;

class Solution {

    public int solution(int[] A, int[] B) {
        int N = A.length;
        
        Stack<Integer> stack = new Stack<Integer>();
        
        for (int i = 0; i < N; i++) {
            if (B[i] == 1) {
                stack.push(i);
            }
            else {
                while (!stack.isEmpty() && B[stack.peek()] == 1 && A[i] > A[stack.peek()]) {
                    stack.pop();    
                }

                if (stack.isEmpty() || B[stack.peek()] == 0) {
                    stack.push(i);    
                } 
            }
        }
        
        return stack.size();
    }
    
}
