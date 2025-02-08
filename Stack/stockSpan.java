import java.util.Stack;

public class stockSpan {
    public static void StockSpan(int Stock[], int Span[]) {
        Stack<Integer> s = new Stack<>();
        Span[0] = 1;
        s.push(0);
        for (int i = 0; i < Stock.length; i++) {
            int currPrice = Stock[i];
            while (!s.isEmpty() && currPrice > Stock[s.peek()]) {
                s.pop();
            }
            if (s.isEmpty()) {
                Span[i] = i + 1;
            } else {
                int prev = s.peek();
                Span[i] = i - prev;
            }
            s.push(i);
        }
    }

    public static void main(String[] args) {
        int Stock[] = { 100, 80, 60, 70, 60, 85, 100 };
        int Span[] = new int[Stock.length];
        StockSpan(Stock, Span);
        for (int i = 0; i < Span.length; i++) {
            System.out.println(Span[i]);
        }
    }
}
