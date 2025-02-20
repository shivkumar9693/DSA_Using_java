public class Basic {
    // node class
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

    // binary class
    static class BinarryTree {
        static int idx = -1;

        public static Node bulidTree(int node[]) {
            idx++;
            if (node[idx] == -1) {
                return null;
            }
            Node newNode = new Node(node[idx]);
            newNode.left = bulidTree(node);
            newNode.right = bulidTree(node);
            return newNode;
        }

        // preorder
        public static void preOrder(Node root) {
            if (root == null) {
                System.out.print("-1" + " ");
                return;
            }
            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);
        }

        // postorder
        public static void postOrder(Node root) {
            if (root == null) {
                return;
            }
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data + " ");
        }

        // inOrder
        public static void inOrder(Node root) {
            if (root == null) {
                return;
            }
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }

    }

    public static void main(String[] args) {
        // tree declaration
        int[] node = { 1, 2, 4, -1, -1, 5, -1, -1, 3, 6, -1, -1, -1 };
        BinarryTree tree = new BinarryTree();
        Node root = tree.bulidTree(node);
        // System.out.println(root.data + " ");
        // tree.preOrder(root);
        // tree.postOrder(root);
        tree.inOrder(root);

    }
}
