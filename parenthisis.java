//nazrait tefera
//november 11
//this checks if an input string is valid
public class ParenthesisChecker {

    //
    // Pre-condition: the input s may contain braces,brackets or parenthisis but cant be null 
    // Post-condition: Prints true if all are properly matched and ordered
    //
    public static void main(String[] args) {
        String s = "{[()]}";  
        System.out.println(isValid(s));
    }

    //
    // Pre-condition: The input string s includes '(', ')', '{', '}', '[' or ']'.
    //               
    // Post-condition: Returns true if all types of brackets are balanced and correctly ordered
    //
    public static boolean isValid(String s) {
        int round = 0;  
        int curly = 0;  
        int square = 0; 

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            
            if (c == '(') {
                round++;
            } else if (c == '{') {
                curly++;
            } else if (c == '[') {
                square++;
            }
            
            else if (c == ')') {
                round--;
                if (round < 0) {
                    return false; 
                }
            } else if (c == '}') {
                curly--;
                if (curly < 0) {
                    return false; 
                }
            } else if (c == ']') {
                square--;
                if (square < 0) {
                    return false; 
                }
            }
        }

        // all counts should be 0 if every opening has a closing
        return (round == 0 && curly == 0 && square == 0);
    }
}