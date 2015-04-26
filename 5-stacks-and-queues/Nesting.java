import java.util.*;

class Solution {

    public int solution(String S) {
        Stack<Character> stack = new Stack<Character>();
        
        for (char c : S.toCharArray()) {
            if (c == '(') {
                stack.push(c);    
            }
            else {
                if (!stack.isEmpty() && stack.peek() == '(') {
                    stack.pop();
                }
                else {
                    return 0;
                }
            }
        }
        
        return (stack.isEmpty()) ? 1 : 0;
    }
    
}
