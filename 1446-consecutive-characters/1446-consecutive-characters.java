import java.util.Stack;
import java.util.Collections;

class Solution {
    public int maxPower(String s) {

        int start = 0;
        int c = 1;

        Stack<Integer> stack = new Stack<>();

        while (start < s.length() - 1) {

            if (s.charAt(start) == s.charAt(start + 1)) {
                c++;
            } 
            else {
                stack.push(c);
                c = 1;
            }

            start++;
        }

        stack.push(c);

        return Collections.max(stack);
    }
}