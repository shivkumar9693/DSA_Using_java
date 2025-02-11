import java.util.Stack;

public class validParentheses {
    public static boolean valid(String str) {
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            // check for opening
            if (ch == '(' || ch == '{' || ch == '[') {
                s.push(ch);
            } else {
                // closing
                // check if stack is empty
                if (s.isEmpty()) {
                    return false;
                } else {
                    // check for pair
                    if ((s.peek() == '(' && ch == ')')
                            || (s.peek() == '{' && ch == '}')
                            || (s.peek() == '[' && ch == ']')) {
                        s.pop();
                    } else {
                        return false;
                    }
                }
            }
        }
        if (s.isEmpty()) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String str = "({([])})";
        System.out.println(valid(str));
    }
}
