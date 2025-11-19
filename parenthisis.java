// nazrait tefera
// november 11
// ParenthesisChecker - checks if input string has valid matching and ordering of brackets

import java.util.Deque;
import java.util.ArrayDeque;

public class ParenthesisChecker {

    //
    // Pre-condition: the input s may contain braces, brackets or parentheses but can't be null
    // Post-condition: Prints true if all are properly matched and ordered
    //
    public static void main(String[] args) {
        String[] tests = {
            "{[()]}",   
            ")(",       
            "{[}]",     
            "([{}])",   
            "([]{})",   
            "([)]",     
            ""          
        };

        for (String t : tests) {
            System.out.printf("%s -> %b%n", t, isValid(t));
        }
    }

    //
    // Pre-condition: The input string s includes '(', ')', '{', '}', '[' or ']'.
    // Post-condition: Returns true if all types of brackets are balanced and correctly ordered
    //
    public static boolean isValid(String s) {
        if (s == null) return false; 
        Deque<Character> stack = new ArrayDeque<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            }
            
            else if (c == ')' || c == '}' || c == ']') {
                if (stack.isEmpty()) {
                    
                    return false;
                }
                char top = stack.pop();
                if (!matches(top, c)) {
                    
                    return false;
                }
            }
            
            else {
                
            }
        }

       
        return stack.isEmpty();
    }

   
    private static boolean matches(char open, char close) {
        return (open == '(' && close == ')') ||
               (open == '{' && close == '}') ||
               (open == '[' && close == ']');
    }
}
