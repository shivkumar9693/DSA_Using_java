import org.w3c.dom.Node;

public class DiameterOfNode {
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

    public static int height(Node root) {
        if (root == null) {
            return 0;
        }
        int left = height(root.left);
        int right = height(root.right);
        return Math.max(left, right) + 1;
    }

    // diameter
    public static int diameter(Node root) {
        if (root == null) {
            return 0;
        }
        int L_diameter = diameter(root.left);
        int l_height = height(root.left);
        int R_diameter = diameter(root.right);
        int r_height = height(root.right);
        int self_diameter = l_height + r_height + 1;
        return Math.max(self_diameter, Math.max(R_diameter, L_diameter));
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
        System.out.println(diameter(root));
    }
}
