import java.util.Stack;

public class ReverseString {
    public static String reverse(String str) {
        Stack<Character> s = new Stack<>();
        int index = 0;
        while (index < str.length()) {
            s.push(str.charAt(index));
            index++;
        }
        // reverse the string using stringbuilder
        StringBuilder result = new StringBuilder(" ");
        while (!s.isEmpty()) {
            char curr = s.pop();
            result.append(curr);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String str = "hello";
        String res = reverse(str);
        System.out.println(res);

    }
}
