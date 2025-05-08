import java.util.LinkedList;

public class UsingColl {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();
        l1.addFirst(1);
        l1.addLast(3);
        l1.addLast(3);
        // l1.removeFirst();
        l1.remove(0);
        System.out.println(l1);
    }
}
