package ValidParentheses;

import java.util.Stack;

public class isValidTest {
    public static void main(String[] args) {
        //isValidTest t = new isValidTest();
        //System.out.println(t.isValid("()[]{}"));

        Stack<Character> stack = new Stack<>();
        stack.push('a');
        stack.push('b');
        stack.push('c');
        System.out.println(stack.peek());   // peek() 不执行把栈元素取出来
        System.out.println(stack.size());

    }

    boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(')');
            } else if (c == '[') {
                stack.push(']');
            } else if (c == '{') {
                stack.push('}');
            } else if (stack.isEmpty() || c != stack.pop() ) {
                return false;
            }
        }
        return stack.isEmpty();
    }
}
