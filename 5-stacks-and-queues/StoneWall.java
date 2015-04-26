import java.util.*;

class Solution {

    public int solution(int[] H) {
        Stack<Integer> stack = new Stack<Integer>();
        
        int res = 0;
        for (int h : H) {
            while (!stack.isEmpty() && h < stack.peek()) {
                stack.pop(); 
            }
            if (stack.isEmpty() || (!stack.isEmpty() && h > stack.peek())) {
                stack.push(h);
                res++;
            }
        }
        
        return res++;
    }

}