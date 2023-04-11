package org.example;
import java.util.LinkedList;
import java.util.Map;
import java.util.HashMap;
import java.util.Deque;

public class Main {
    public static void main(String[] args) {
        System.out.println(isCorrectParentheses("()")); // true
        System.out.println(isCorrectParentheses("(")); // false
        System.out.println(isCorrectParentheses("())")); // false
        System.out.println(isCorrectParentheses("((()))")); // true
        System.out.println(isCorrectParentheses("()[]{}<>")); // true
        System.out.println(isCorrectParentheses("([)]")); // false
        System.out.println(isCorrectParentheses("][]")); // false
        System.out.println(isCorrectParentheses("[]{<()[]<>>}")); // true
    }
    static boolean isCorrectParentheses(String parentheses) {
        Map<Character, Character> brackets = new HashMap<>();
        brackets.put(')', '(');
        brackets.put('}', '{');
        brackets.put(']', '[');
        brackets.put('>', '<');
        brackets.put('}', '{');
        Deque<Character> stack = new LinkedList<>();
        for (char c : parentheses.toCharArray()) {
            if (brackets.containsValue(c)) {

                stack.push(c);
            } else if (brackets.containsKey(c)) {

                if (stack.isEmpty() || stack.pop() != brackets.get(c)) {
                    return false;
                }
            }
        }

        return stack.isEmpty();

    }
}