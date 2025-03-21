import java.util.*;

public class reverseStack {
    public static void pushAtBottom(Stack<Integer> s, int data) {
        // check if stack is empty
        if (s.isEmpty()) {
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }

    public static void reverse(Stack<Integer> s) {
        // check stack is empty
        if (s.isEmpty()) {
            return;
        }
        int top = s.pop();
        reverse(s);
        pushAtBottom(s, top);
    }

    // printing stack
    public static void printStack(Stack<Integer> s) {
        while (!s.isEmpty()) {
            System.out.println(s.pop());

        }
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        // prev stack
        // printStack(s);
        // reverse it
        reverse(s);
        // print reverse stack
        printStack(s);

    }
}