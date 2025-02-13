import java.util.Scanner;
import java.util.Stack;

public class duplibatePranthesis {
    public static boolean Duplicate(String str) {
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == ')') {
                int count = 0;
                while (s.peek() != '(') {
                    s.pop();
                    count++;
                }
                if (count < 1) {
                    return true;
                } else {
                    s.pop();
                }

            } else {
                s.push(ch);
            }

        }
        return false;
    }

    public static void main(String[] args) {
        // String str = "(((a+b)+(c+d)))";
        System.out.println("enter string:");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        System.out.println(Duplicate(str));
    }
}
