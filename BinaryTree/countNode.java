public class countNode {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }

    }

    public static int count(Node root) {
        if (root == null) {
            return 0;
        }
        int l_height = count(root.left);
        int r_height = count(root.right);
        return l_height + r_height + 1;

    }

    public static void main(String[] args) {
        // (1)
        // / \
        // (2) (3)
        // / \
        // (4) (5)

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        System.out.println(count(root));
    }
}
